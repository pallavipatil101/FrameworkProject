package com.toolsQA.testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.toolsQA.pageObjects.FormsPage;
import com.toolsQA.pageObjects.HomePage;
import com.toolsQA.resources.Base;

public class FormsPageTest extends Base{
	public WebDriver driver;
	public FormsPage form;
	public HomePage home;
	public JavascriptExecutor js;
	public Select select;
	
	@BeforeTest
	public void clickElementTest() throws IOException {
		
		driver = initializeBrowser();
		driver.get(pro.getProperty("baseurl"));
		home = new HomePage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", home.forms());
		home.forms().click();
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(priority = 0)
	public void testBoxTest() {
		form = new FormsPage(driver);
		form.forms().click();
		form.practiceForm().click();
		form.firstName().sendKeys("Zaphod");
		form.lastName().sendKeys("Beeblebrox");
		form.email().sendKeys("Zaphod@hitchhiker.com");	
		form.mobileNumber().sendKeys("1234567789");
	}
	
	@Test(priority = 1)
	public void radioButtons() {
		Actions action = new Actions(driver);
		
		for(WebElement gender : form.radiosGender())
		{
			if(gender.getAttribute("value").equals("Female"))
			{
				if(!gender.isSelected())
				{
					action.moveToElement(gender).click().build().perform();
				}
			}
		}
	}
	
	@Test(priority = 2)
	public void calender() {
		Actions action = new Actions(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", form.calender());
		form.calender().click();
		select = new Select(form.birthMonthDropDown());
		select.selectByVisibleText("December");
		select = new Select(form.birthYearDropDown());
		select.selectByVisibleText("1971");
		action.moveToElement(form.birthDate()).click().build().perform();
	}
	
	@Test(priority = 3)
	public void checkboxes() {
		Actions action = new Actions(driver);
		for(WebElement hobby : form.checkBoxHobbies())
		{
			if(hobby.getAttribute("value").equals("2"))
			{
				if(!hobby.isSelected())
				{
					action.moveToElement(hobby).click().build().perform();
					//hobby.click();
				}
			}
		}
	}
	
	
	@Test(priority = 4)
	public void uploadPhoto() {
		form.uploadPhoto().sendKeys(System.getProperty("user.dir")+"/Data/Photo.jpeg");
	}
	
	@Test(priority = 5)
	public void address() {
		form.address().sendKeys("Balewadi");
	}
	
	
	@Test(priority = 6)
	public void subject() {
		form.subject().click();
		form.subject().sendKeys("maths");
		form.subject().submit();
	}
	
	@AfterTest
	public void tearDow() {
		driver.close();
	}
}
