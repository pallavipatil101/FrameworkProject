package com.toolsQA.testCases;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.toolsQA.pageObjects.AlertsFramesWindowsPage;
import com.toolsQA.pageObjects.HomePage;
import com.toolsQA.resources.Base;
import org.openqa.selenium.Alert;

public class AlertsWindowsFramesTest extends Base {
	public WebDriver driver;
	public AlertsFramesWindowsPage a = new AlertsFramesWindowsPage(driver);
	public HomePage home;
	
	@BeforeTest
	public void clickElementTest() throws IOException {
		
		driver = initializeBrowser();
		driver.get(pro.getProperty("baseurl"));
		home = new HomePage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", home.alertFramesWindows());
		home.alertFramesWindows().click();
	}
	
	@Test(priority = 0)
	public void windowsTest() {
		a = new AlertsFramesWindowsPage(driver);
		a.windows().click();
		a.newTab().click();
		windowHandling();				
		//Switching to the newly opened window.
		driver.switchTo().window(childwindow);			
		//Verifying msg on new window
		System.out.println(a.heading().isDisplayed());	
		//Switching back to original window.
		driver.switchTo().window(parentwindow);
		
		a.newWindow().click();
		windowHandling();
		//Switching to the newly opened window.
		driver.switchTo().window(childwindow);			
		//Verifying msg on new window
		System.out.println(a.heading().isDisplayed());	
		//Switching back to original window.
		driver.switchTo().window(parentwindow);
		
		a.newWindowWithMsg().click();
		windowHandling();
		//Switching to the newly opened window.
		driver.switchTo().window(childwindow);			
		//Verifying msg on new window
		System.out.println(a.heading().isDisplayed());	
		//Switching back to original window.
		driver.switchTo().window(parentwindow);
	}
	
	@Test(priority = 1)
	public void alertsTest() throws InterruptedException {
		a = new AlertsFramesWindowsPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", a.alerts());
		a.alerts().click();
		a.alert().click();	
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		a.delayAlert().click();
		//Thread.sleep(6000);
		WebDriverWait wait = waiting();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert();
		alert.accept();
		
		a.confirmAlert().click();
		driver.switchTo().alert();
		alert.dismiss();
		Assert.assertEquals(a.confirmAlertResult().getText(), "You selected Cancel");
		
		a.promtAlert().click();
		driver.switchTo().alert();
		alert.sendKeys("Hello");
		alert.accept();
		Assert.assertEquals(a.promptAlertResult().getText(), "You entered Hello");
	}
	
	@Test(priority = 2)
	public void framesTest() {
		a = new AlertsFramesWindowsPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", a.frames());
		a.frames().click();
		driver.switchTo().frame(a.frame1());
		Assert.assertEquals(a.heading().getText(), "This is a sample page");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(a.frame2());
		Assert.assertEquals(a.heading().getText(), "This is a sample page");
		driver.switchTo().defaultContent();
	}
	
	@Test(priority = 3)
	public void nestedFramesTest() {
		a = new AlertsFramesWindowsPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", a.nestedFrames());
		a.nestedFrames().click();
		driver.switchTo().frame(a.parentFrame());
		Assert.assertEquals(a.parentFrameMsg().getText(), "Parent frame");
		//Switching to child frame within paent frame.
		driver.switchTo().frame(0);
		Assert.assertEquals(a.childFrameMsg().getText(), "Child Iframe");	
		driver.switchTo().defaultContent();
	}
	
	@Test(priority = 4)
	public void modalTest() {
		a = new AlertsFramesWindowsPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", a.modal());
		a.modal().click();
		a.smallModal().click();
		System.out.println(a.smallModalText().getText());
		//Assert.assertEquals(a.smallModalText().getText(), "This is a small modal. It has very less content");
		a.smallModalButton().click();
		a.largeModal().click();
		System.out.println(a.largeModalText().getText());
		//Assert.assertTrue(a.largeModalText().getText().contains("Lorem Ipsum is simply dummy text"));
		a.largeModalButton().click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
