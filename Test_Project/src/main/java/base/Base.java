package base;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {

	public static WebDriver driver;
	public String parentwindow;
	public String childwindow;
	
	@BeforeSuite
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","/home/josh/eclipse-workspace/toolsQA/Drivers/chromedriver");
		/*driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		if(driver == null) {
			System.out.println("driver is null...!");
		}*/
		
		String downloadPath = System.getProperty("user.dir")+"/DownloadedFiles";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.setExperimentalOption("prefs", chromePrefs);
	    driver = new ChromeDriver(chromeOptions);
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/");
	}
	
	public void scroll_to_element(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public void verify_text(String expected, WebElement element) {
		String actual = element.getText();
		System.out.println(expected +"--------"+actual);
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
	
	@AfterSuite
	public void teardown() {
		//driver.quit();
	}
}
