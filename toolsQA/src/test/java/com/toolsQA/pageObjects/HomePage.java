package com.toolsQA.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class=\"category-cards\"]/div[1]/div/div[2]")
	private WebElement elements;
	
	@FindBy(xpath = "//*[@class=\"category-cards\"]/div[2]/div/div[2]")
	private WebElement forms;
	
	@FindBy(xpath = "//*[@class=\"category-cards\"]/div[3]/div/div[2]")
	private WebElement alertFramesWindows;
	
	@FindBy(xpath = "//*[@class=\"category-cards\"]/div[4]/div/div[2]")
	private WebElement widgets;
	
	@FindBy(xpath = "//*[@class=\"category-cards\"]/div[5]/div/div[2]")
	private WebElement interactions;
	
	@FindBy(xpath = "//*[@class=\"category-cards\"]/div[6]/div/div[2]")
	private WebElement bookStore;
	
	
	
	public WebElement elements() {return elements;}
	
	public WebElement forms() {return forms;}
	
	public WebElement alertFramesWindows() {return alertFramesWindows;}
	
	public WebElement widgets() {return widgets;}
	
	public WebElement interactions() {return interactions;}	
	
	public WebElement bookStore() {return bookStore;}
}
