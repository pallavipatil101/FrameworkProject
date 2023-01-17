package com.toolsQA.testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.toolsQA.pageObjects.HomePage;
import com.toolsQA.pageObjects.WidgetsPage;
import com.toolsQA.resources.Base;

public class WidgetsPageTest extends Base {
	public WebDriver driver;
	public WidgetsPage widget;
	public HomePage home;
	
	@BeforeTest
	public void clickElementTest() throws IOException {
		
		driver = initializeBrowser();
		driver.get(pro.getProperty("baseurl"));
		home = new HomePage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", home.widgets());
		home.widgets().click();
	}
	
	@Test(priority = 0)
	public void accordianTest() {
		widget = new WidgetsPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", widget.accordian());
		widget.accordian().click();
		js.executeScript("arguments[0].scrollIntoView();", widget.accordianHeading2());
		widget.accordianHeading2().click();
		//System.out.println(widget.accordianHeading2Msg().isDisplayed());
		js.executeScript("arguments[0].scrollIntoView();", widget.accordianHeading3());
		widget.accordianHeading3().click();
		//System.out.println(widget.accordianHeading3Msg().isDisplayed());
	}
	
	@Test(priority = 1)
	public void datePickerTest()  {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", widget.datePicker());
		widget.datePicker().click();
		widget.calender1().click();
		Select s;
		s = new Select(widget.calender1MonthBtn());
		s.selectByVisibleText("March");
		s = new Select(widget.calender1YearBtn());
		s.selectByVisibleText("1996");
		widget.calender1date().click();
		
		widget.calender2().click();
		//Thread.sleep(4000);
		widget.calender2MonthButton().click();
		
		
		for(WebElement m : widget.calender2MonthList())
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(m));
			if(m.getText().equals("March"))
			{
				m.click();
				break;
			}
		}
		widget.calender2YearButton().click();
		for(WebElement m : widget.calender2YearList())
		{
			if(m.getText().equals("2025"))
			{
				m.click();
				break;
			}
		}
	}
	
	@Test(enabled =  false)
	public void sliderTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", widget.slider());
		widget.slider().click();
		Point locationBefore = widget.sliderButton().getLocation();
		Actions action = new Actions(driver);
		action.dragAndDropBy(widget.sliderButton(), 70, 0).build().perform();
		Point locationAfter = widget.sliderButton().getLocation();
		Assert.assertNotEquals(locationAfter, locationBefore);
	}
	
	@Test(priority = 2)
	public void progressBarTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", widget.progressBar());
		widget.progressBar().click();
		System.out.println("progress: "+widget.trackProgress().getAttribute("aria-valuenow"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		widget.progressBarButton().click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//widget.progressBarButton().click();
		System.out.println("progress: "+widget.trackProgress().getAttribute("aria-valuenow"));
	}
	
	@Test(priority = 3)
	public void tabsTest() {	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", widget.tabs());
		widget.tabs().click();
		
		for(WebElement tab : widget.tabsList())
		{
			if(tab.getText().equals("Origin"))
			{
				tab.click();
			}
		}
	}
	
	@Test(priority = 4)
	public void toolTipsTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", widget.toolTips());
		widget.toolTips().click();
		Actions action = new Actions(driver);
		action.moveToElement(widget.toolTipButton()).build().perform();
		action.moveToElement(widget.toolTipTextField()).build().perform();
	}
	
	@Test(priority = 5)
	public void menu() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", widget.menu());
		widget.menu().click();
		Actions action = new Actions(driver);
		action.moveToElement(widget.menu1()).build().perform();
		action.moveToElement(widget.menu3()).build().perform();
		action.moveToElement(widget.menu2()).build().perform();
		action.moveToElement(widget.subItem1()).build().perform();
		action.moveToElement(widget.subItem2()).build().perform();
		action.moveToElement(widget.subMenu()).build().perform();
		action.moveToElement(widget.subMenuItem1()).build().perform();
		action.moveToElement(widget.subMenuItem2()).build().perform();		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
