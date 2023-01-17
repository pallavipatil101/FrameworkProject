package com.toolsQA.testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.toolsQA.pageObjects.HomePage;
import com.toolsQA.pageObjects.InteractionsPage;
import com.toolsQA.resources.Base;

public class InteractionsTest extends Base {
	public WebDriver driver;
	public HomePage home;
	public InteractionsPage interaction;
	
	@BeforeTest
	public void clickElementTest() throws IOException {
		
		driver = initializeBrowser();
		driver.get(pro.getProperty("baseurl"));
		home = new HomePage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", home.alertFramesWindows());
		home.interactions().click();
		interaction = new InteractionsPage(driver);
	}
	
	@Test(priority = 0)
	public void sortableTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", interaction.sortable());
		interaction.sortable().click();
		
		for(WebElement tab : interaction.tabsListSortable())
		{
			if(tab.getText().equals("Grid"))
			{
				tab.click();
			}
		}
		//Verifying if switch to grid is successful
		for(WebElement e : interaction.sortableGridElements())
		{
			Assert.assertTrue(e.isDisplayed());
		}
	}
	
	@Test(priority = 1)
	public void selectableTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", interaction.selectable());
		interaction.selectable().click();
		//Selecting list elements
		for(WebElement list : interaction.selectableListElements())
		{
			list.click();
		}
		//switching to grid
		for(WebElement tab : interaction.tabsListSelectable())
		{
			if(tab.getText().equals("Grid"))
			{
				tab.click();
			}
		}
		//selecting grid elements
		for(WebElement list : interaction.selectableGridElements())
		{
			list.click();
		}		
	}
	
	@Test(priority = 2)
	public void resizableTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", interaction.resizable());
		interaction.resizable().click();
		Actions action = new Actions(driver);
		
		js.executeScript("arguments[0].scrollIntoView();", interaction.resize1());
		action.moveToElement(interaction.resize1()).clickAndHold().build().perform();
		action.dragAndDropBy(interaction.resize1(), 160, 160).build().perform();
		
		js.executeScript("arguments[0].scrollIntoView();", interaction.resize2());
		action.moveToElement(interaction.resize2()).clickAndHold().build().perform();
		action.dragAndDropBy(interaction.resize2(), 150, 300).build().perform();
	}
	
	@Test(priority = 3)
	public void droppableTest() {
		interaction.droppable().click();
		String simpleDropMsg = interaction.commonDropMsg().getText();
		Actions action = new Actions(driver);
		action.dragAndDrop(interaction.dragSimple(), interaction.dropCommon()).build().perform();;
		Assert.assertNotEquals(simpleDropMsg, interaction.commonDropMsg().getText());
		Assert.assertEquals(interaction.commonDropMsg().getText(), "Dropped!");
		
		//Switching to Accept tab
		for(WebElement tab : interaction.tabsListDroppable())
		{
			if(tab.getText().equals("Accept"))
			{
				tab.click();
			}
		}

		//action.dragAndDrop(interaction.dragAcceptable(), interaction.dropCommon()).build().perform();
		//Assert.assertTrue(interaction.commonDropMsg().getText().equals("Drop here"));
		//action.dragAndDrop(interaction.dragNonRevertabl(), interaction.dropCommon()).build().perform();
	}
	
	@Test(priority = 4)
	public void draggableTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", interaction.draggable());
		interaction.draggable().click();
		Point locSimpleDrag =interaction.draggableSimple().getLocation();
		Actions action = new Actions(driver);
		action.dragAndDropBy(interaction.draggableSimple(), 100, 100).build().perform();
		Assert.assertNotEquals(interaction.draggableSimple().getLocation(), locSimpleDrag);
		
		//Switching to Axis Restricted tab
		for(WebElement tab : interaction.tabsListDraggable())
		{
			if(tab.getText().equals("Axis Restricted"))
			{
				tab.click();
			}
		}
		Point locXDrag =interaction.draggableXAxis().getLocation();
		Point locYDrag =interaction.draggableYAxis().getLocation();
		
		action.dragAndDropBy(interaction.draggableXAxis(), 100, 0).build().perform();
		Assert.assertNotEquals(interaction.draggableXAxis().getLocation(), locXDrag);
		action.dragAndDropBy(interaction.draggableYAxis(), 0, 60).build().perform();
		Assert.assertNotEquals(interaction.draggableYAxis().getLocation(), locYDrag);
		
		//Switching to Container Restricted tab
		for(WebElement tab : interaction.tabsListDraggable())
		{
			if(tab.getText().equals("Container Restricted"))
			{
				tab.click();
			}
		}
		
		Point locBoxContained = interaction.draggableBoxContained().getLocation();
		Point locPageContaned = interaction.draggablePageContained().getLocation();
		
		action.dragAndDropBy(interaction.draggableBoxContained(), 100, 30).build().perform();
		Assert.assertNotEquals(interaction.draggableBoxContained().getLocation(), locBoxContained);
		
		js.executeScript("arguments[0].scrollIntoView();", interaction.draggablePageContained());
		action.dragAndDropBy(interaction.draggablePageContained(), 20, 30).build().perform();
		Assert.assertNotEquals(interaction.draggablePageContained().getLocation(), locPageContaned);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
