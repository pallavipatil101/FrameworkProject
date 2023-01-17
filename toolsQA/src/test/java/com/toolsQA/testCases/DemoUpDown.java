package com.toolsQA.testCases;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.toolsQA.pageObjects.ElementsPage;
import com.toolsQA.pageObjects.HomePage;
import com.toolsQA.pageObjects.WidgetsPage;
import com.toolsQA.resources.Base;
import com.toolsQA.utilities.excelUtils;

public class DemoUpDown {
	public WebDriver driver;
	public Select s;
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws IOException, InterruptedException {
		WidgetsPage w = new WidgetsPage(driver);
		w.calender2().click();
		//Thread.sleep(4000);
		w.calender2MonthButton().click();
		
		
		for(WebElement m : w.calender2MonthList())
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(m));
			if(m.getText().equals("March"))
			{
				m.click();
				break;
			}
		}
		
		
		WebElement arrow = driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[13]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", arrow);
		
		for(int i=1; i<=25; i++)
		{
			arrow.click();
		}
		
		w.calender2YearButton().click();
		for(WebElement m : w.calender2YearList())
		{
			if(m.getText().equals("1996"))
			{
				m.click();
				break;
			}
		}
		w.calender1date().click();
	}
}
