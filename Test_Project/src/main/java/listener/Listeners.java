package listener;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import base.Base;
import extent.reporter.ExtentReporter;

public class Listeners extends Base implements ITestListener{
	ExtentReports extentReport = ExtentReporter.getExtentReport();
	ExtentTest extentTest;
	ThreadLocal<ExtentTest> extentTestThread = new ThreadLocal<ExtentTest>();
	public WebDriver driver = null;
	
	public void onTestStart(ITestResult result) {
		extentTest = extentReport.createTest(result.getName()+" execution started");
		extentTestThread.set(extentTest);
	}

	public void onTestSuccess(ITestResult result) {
		String testname = result.getName();
		//extentTest.log(Status.PASS,testname+" Test Passed");
		extentTestThread.get().log(Status.PASS,testname+" Test Passed");	// making it thread safe
	}

	public void onTestFailure(ITestResult result) {
		//extentTest.fail(result.getThrowable());	// to print cause of error/exception in report. without it itll show as pass
		extentTestThread.get().fail(result.getThrowable());
		//WebDriver driver = null;
		String testMethodName = result.getName();
		
		try {
			String screenshotPath = takeScreenshot(testMethodName);
			extentTestThread.get().addScreenCaptureFromPath(screenshotPath, testMethodName);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		
		/*String testMethodName = result.getName();
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			takeScreenshot(testMethodName,driver);
		} catch (IOException e) {
			
			e.printStackTrace();
		}*/
	}

	public void onTestSkipped(ITestResult result) {
		String testname = result.getName();
		extentTestThread.get().log(Status.SKIP,testname+" Test Passed");
	}

	
	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		extentReport.flush();
	}

}
