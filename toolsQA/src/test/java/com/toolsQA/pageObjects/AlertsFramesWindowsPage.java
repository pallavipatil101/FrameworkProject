package com.toolsQA.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsFramesWindowsPage {
	WebDriver driver;
	
	public AlertsFramesWindowsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class = \"text\"] [text()=\"Browser Windows\"]")
	private WebElement windows;
	
	@FindBy(id = "tabButton")
	private WebElement newTab;
	
	@FindBy(id = "sampleHeading")
	private WebElement heading;
	
	@FindBy(id = "windowButton")
	private WebElement newWindow;
	
	@FindBy(id = "messageWindowButton")
	private WebElement newWindowWithMsg;
	
	@FindBy(xpath = "/html/body/text()")
	private WebElement newWindowMsg;
	
	
	@FindBy(xpath = "//*[@class = \"text\"] [text()=\"Alerts\"]")
	private WebElement alerts;
	
	@FindBy(id = "alertButton")
	private WebElement alert;
	
	@FindBy(id = "timerAlertButton")
	private WebElement delayAlert;
	
	@FindBy(id = "confirmButton")
	private WebElement confirmAlert;
	
	@FindBy(id = "confirmResult")
	private WebElement confirmAlertResult;
	
	@FindBy(id = "promtButton")
	private WebElement promtAlert;	
	
	@FindBy(id = "promptResult")
	private WebElement promptAlertResult;
	
	
	@FindBy(xpath = "//*[@class = \"text\"] [text()=\"Frames\"]")
	private WebElement frames;
	
	@FindBy(id = "frame1")
	private WebElement frame1;
	
	@FindBy(id = "frame2")
	private WebElement frame2;
		
	
	@FindBy(xpath = "//span[@class = \"text\"] [text()=\"Nested Frames\"]")
	private WebElement nestedFrames;
	
	@FindBy(id = "frame1")
	private WebElement parentFrame;
	
	@FindBy(xpath = "//*[text() = 'Parent frame']")
	private WebElement parentFrameMsg;
	
	@FindBy(name = "Child Iframe")
	private WebElement childFrame;
	
	@FindBy(xpath = "//*[text() = 'Child Iframe']")
	private WebElement childFrameMsg;
	
		
	@FindBy(xpath = "//*[@class = \"text\"] [text()=\"Modal Dialogs\"]")
	private WebElement modal;
	
	@FindBy(id = "showSmallModal")
	private WebElement smallModal;
	
	@FindBy(xpath = "//div[@class = 'modal-body']")
	private WebElement smallModalText;
	
	@FindBy(id = "closeSmallModal")
	private WebElement closeSmallModal;
	
	@FindBy(id = "showLargeModal")
	private WebElement largeModal;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[2]/p") ///html/body/div[4]/div/div/div[2]/p/text()
	private WebElement largeModalText;
	
	@FindBy(id = "closeLargeModal")
	private WebElement closeLargeModal;
	
	
	//WINDOWS	
	public WebElement windows() {return windows;}	
	public WebElement newTab() {return newTab;}	
	public WebElement heading() {return heading;}
	public WebElement newWindow() {return newWindow;}	
	public WebElement newWindowWithMsg() {return newWindowWithMsg;}
	public WebElement newWindowMsg() {return newWindowMsg;}
	
	//ALERTS	
	public WebElement alerts() {return alerts;}
	public WebElement alert() {return alert;}
	public WebElement delayAlert() {return delayAlert;}
	public WebElement confirmAlert() {return confirmAlert;}
	public WebElement confirmAlertResult() {return confirmAlertResult;}
	public WebElement promtAlert() {return promtAlert;}
	public WebElement promptAlertResult() {return promptAlertResult;}
	
	//FRAMES
	public WebElement frames() {return frames;}
	public WebElement frame1() {return frame1;}
	public WebElement frame2() {return frame2;}
	
	//NESTED FRAMES
	public WebElement nestedFrames() {return nestedFrames;}	
	public WebElement parentFrame() {return parentFrame;}	
	public WebElement childFrame() {return childFrame;}
	public WebElement parentFrameMsg() {return parentFrameMsg;}
	public WebElement childFrameMsg() {return childFrameMsg;}
	
	//MODAL
	public WebElement modal() {return modal;}
	public WebElement smallModal() {return smallModal;}
	public WebElement largeModal() {return largeModal;}
	public WebElement smallModalText() {return smallModalText;}
	public WebElement largeModalText() {return largeModalText;}
	public WebElement smallModalButton() {return closeSmallModal;}
	public WebElement largeModalButton() {return closeLargeModal;}
}
