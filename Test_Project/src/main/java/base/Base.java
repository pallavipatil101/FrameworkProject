package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Base {

	public static WebDriver driver;
	public String parentwindow;
	public String childwindow;
	public Properties pro;
	
	//@BeforeSuite
	@BeforeClass
	public void setup() throws IOException {
		pro = new Properties();
		String path = System.getProperty("user.dir")+"/src/test/resources/Config.properties";
		FileInputStream fin = new FileInputStream(path);
		pro.load(fin);
		
		String browserName = pro.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
		
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver");

			String downloadPath = System.getProperty("user.dir")+"/DownloadedFiles";
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", downloadPath);
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("prefs", chromePrefs);
			driver = new ChromeDriver(chromeOptions);
		}
		
		else if (browserName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Drivers/geckodriver");
			driver = new FirefoxDriver();
		} 
		
	    driver.manage().window().maximize();
	    
	    if(driver == null) { System.out.println("driver is null...!"); }
	    
	    driver.get(pro.getProperty("baseurl"));
	}
	
	public void scroll_to_element(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public void verify_text(String expected, WebElement element) {
		String actual = element.getText();
	//	System.out.println(expected +"--------"+actual);
		Assert.assertEquals(actual, expected );
		
	}
	
	public void stringsNotEqual(String expected, String actual) {
		Assert.assertNotEquals(actual, expected );
	}
	
	public void isTrue(Boolean value) {
		Assert.assertTrue(value);
	}
	
	public void isFalse(Boolean value) {
		Assert.assertTrue(!value);
	}
	
	public void send(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public Actions action() {
		Actions action = new Actions(driver);
		return action;
	}
	
	public WebDriverWait waiting() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait;
	}
	
	public void handleWindows() {
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> iterator = windowids.iterator();
		parentwindow = iterator.next();
		childwindow = iterator.next();
	}
	
	public String takeScreenshot(String testName) throws IOException {
		
		File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationFilePath = System.getProperty("user.dir")+"/screenshots/"+testName+".png";
		FileUtils.copyFile(SourceFile,new File(destinationFilePath));
		return destinationFilePath;
	}

	public void navigateBack() {
		driver.navigate().back();
	}
	
	//@AfterSuite
	@AfterClass
	public void teardown() {
		//driver.quit();
	}
}
