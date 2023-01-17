package com.toolsQA.testCases;


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.toolsQA.pageObjects.ElementsPage;
import com.toolsQA.pageObjects.HomePage;
import com.toolsQA.resources.Base;


public class ElementsTest extends Base{
	public WebDriver driver;
	public ElementsPage elements;
	public HomePage home;
	
	@BeforeTest
	public void clickElementTest() throws IOException {
		driver = initializeBrowser();
		driver.get(pro.getProperty("baseurl"));
		home = new HomePage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", home.elements());
		home.elements().click();
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(priority = 0)
	public void textBoxTest() throws InterruptedException {
		ElementsPage elements = new ElementsPage(driver);
		//submitting information into textfields.
		elements.textBox().click();	
		elements.userName().sendKeys(pro.getProperty("username"));
		elements.userEmail().sendKeys(pro.getProperty("email"));
		elements.currentAddress().sendKeys(pro.getProperty("currentaddress"));
		elements.permanentAddress().sendKeys(pro.getProperty("permanentaddress"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", elements.submitButton());
		elements.submitButton().click();
		
		//Verifying if the submitted details are displayed.
		Assert.assertTrue(elements.submittedName().isDisplayed());
	}
	
	@Test(priority = 1)
	public void checkBoxTest() {
		//Checking the checkbox
		elements = new ElementsPage(driver);
		elements.checkBox().click();
		if(!elements.checkbox().isSelected())
		{
			elements.checkbox().click();
		}
	}
	
	@Test(priority = 2)
	public void radioButtonTest() {
		elements = new ElementsPage(driver);
		elements.radioButton().click();
		
		//Iterating radio buttons and clicking one based on 'for' attribute
		for(WebElement r : elements.radios())
		{
			if(r.getAttribute("for").equals("yesRadio"))
			{
				if(!r.isSelected())
				{
					r.click();
				}
			}
		}
	}
	

	@Test(priority = 3)
	public void webTableTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", elements.webTables());
		elements.webTables().click();
		elements.editBtnRow1().click();
		WebDriverWait wait = waiting();
		wait.until(ExpectedConditions.elementToBeClickable(elements.rowFormFirstName()));
		
		elements.rowFormFirstName().clear();
		elements.rowFormLasttName().clear();
		elements.rowFormEmail().clear();
		elements.rowFormAge().clear();
		elements.rowFormSalary().clear();
		elements.rowFormDepartment().clear();
		
		elements.rowFormFirstName().sendKeys("Pallavi");
		elements.rowFormLasttName().sendKeys("Patil");
		//elements.rowFormEmail().sendKeys("pallavi,patil@joshsoftware.com");
		elements.rowFormAge().sendKeys("26");
		elements.rowFormSalary().sendKeys("1111111");
		elements.rowFormDepartment().sendKeys("Quality Assurance");
		elements.rowFormSubmitBtn().click();
		
		for(WebElement row1 : elements.row1())
		{
			System.out.println(row1.getText());
		}
		//Deleting row 2
		elements.deleteBtnRow2().click();
	}
	
	@Test(priority = 4)
	public void buttonsTest() {
		elements = new ElementsPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", elements.buttons());
		elements.buttons().click();
		Actions action = new Actions(driver);
		
		//Clicking buttons
		action.doubleClick(elements.doubleClickBtn()).build().perform();
		action.contextClick(elements.rightClickBtn()).build().perform();
		action.click(elements.dynamicBtn()).build().perform();
		
		//Verifying if messages after button clicks are displayed.
		Assert.assertTrue(elements.doubleClickMessage().isDisplayed());
		Assert.assertTrue(elements.rightClickMessage().isDisplayed());
		Assert.assertTrue(elements.dynamicClickMessage().isDisplayed());

	}
	
	@Test(priority = 5)
	public void linksTest() throws InterruptedException {
		elements = new ElementsPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", elements.links());
		elements.links().click();
		
		//Clicking dynamic link		
		elements.homexncuk().click();
		windowHandling();
				
		//Switching to the newly opened window.
		driver.switchTo().window(childwindow);
				
		//Verifying title.
		Assert.assertEquals(driver.getTitle(), "ToolsQA");
				
		//Switching back to original window.
		driver.switchTo().window(parentwindow);
		
		for(WebElement link : elements.linksList())
		{
			link.click();
		}
		
		/*/Clicking links and Verifying response.	
		for(WebElement link : elements.linksList())
		{
			switch(link.getText()) {
			case "Home"		 :   link.click();
								 windowHandling();
								//Switching to the newly opened window.
								driver.switchTo().window(childwindow);
			
								//Verifying title.
								Assert.assertEquals(driver.getTitle(), "ToolsQA");
			
								//Switching back to original window.
								driver.switchTo().window(parentwindow);
								break;
			
			case "Created"   : 	 link.click();
								 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
								 System.out.println(elements.apiResponse().getText());
								 break;
			
			case "No Content" :  link.click();
								 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
								 System.out.println(elements.apiResponse().getText());
								 break;
			
			case "Moved"	  :	 link.click();
								 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
								 System.out.println(elements.apiResponse().getText());
								 break;	
								
			case "Bad Request":  link.click();
								 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
								 System.out.println(elements.apiResponse().getText());
								 break;	
								
			case "Unauthorized": link.click();
								 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
								 System.out.println(elements.apiResponse().getText());
								 break;	
								 
			case "Forbidden"   : link.click();
								 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
								 System.out.println(elements.apiResponse().getText());
								 break;	
			
			case "Not Found"   : link.click();
								 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
								 System.out.println(elements.apiResponse().getText());
								 break;						 
			}
		}*/
		
		
	}
	
	
	@Test(enabled = false)
	public void brokenLinksTest() {
		elements = new ElementsPage(driver);
		elements.brokenLinks().click();
		
		//Clicking valid link		
		elements.validLink().click();
						
		//Verifying title.
		Assert.assertEquals(driver.getTitle(), "ToolsQA");
		
		//Switching back to original window.
		driver.navigate().back();
		
		//Clicking broken link
		elements.brokenLink().click();
		
		if(elements.brokenLinkMsg().isDisplayed())
		{
			System.out.println("PASSED BROKEN LINK TEST");
		}
		
		//Switching back to original window.
		driver.navigate().back();
		
		
	}
	
	@Test(priority = 6)
	public void uploadDownlosd() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", elements.uploadDownload());
		elements.uploadDownload().click();
		elements.uploadButton().sendKeys(System.getProperty("user.dir")+"/Data/UploadFile.txt");
		elements.downloadButton().click();
	}
	
	@Test(priority = 7)
	public void dynamicPropertiesTest() throws InterruptedException {
		elements = new ElementsPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", elements.dynamicProperties());
		elements.dynamicProperties().click();
		
		//Verifying if disabled button is actually disabled.
		Assert.assertTrue(!elements.dynamicDisabledBtn().isEnabled());
		
		//Fetching color value of color changing button before change.
		String colorBefore = elements.dynamiColorChangeBtn().getCssValue("color");
		
		Thread.sleep(5000);
		
		//Verifying if disabled button is enabled after five seconds.
		Assert.assertTrue(elements.dynamicDisabledBtn().isEnabled());
		
		//Verifying if invisible button is visible after five seconds.
		Assert.assertTrue(elements.dynamicInvisibleBtn().isDisplayed());
		
		//Fetching color value of color changing button after change.
		String colorAfter = elements.dynamiColorChangeBtn().getCssValue("color");
		Assert.assertNotEquals(colorBefore, colorAfter);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}


