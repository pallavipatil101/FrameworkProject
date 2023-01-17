package com.toolsQA.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class ElementsPage {
	WebDriver driver;
	
	public ElementsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//ELEMENTS	
	@FindBy(xpath = "//*[@id=\\\"app\\\"]/div/div/div[2]/div/div[1]/div/div[1]")
	private WebElement elements;
	
	@FindBy(xpath = "//*[text()='Text Box']")
	private WebElement textBox;
	
	@FindBy(id = "userName")
	private WebElement userName;
	
	@FindBy(id = "userEmail")
	private WebElement userEmail; 
	
	@FindBy(id = "currentAddress")
	private WebElement currentAddress;
	
	@FindBy(id = "permanentAddress")
	private WebElement permanentAddress;
	
	@FindBy(id = "submit")
	private WebElement textBoxBtn;
	
	@FindBy(id = "name")
	private WebElement submittedName;
	
	@FindBy(id = "email")
	private WebElement submittedEmail;
	
	@FindBy(id = "currentAddress")
	private WebElement submittedCurrentAddress;
	
	@FindBy(id = "permanentAddress")
	private WebElement submittedPermanentAddress;
	
	
	//CHECKBOX
	@FindBy(xpath = "//*[text()='Check Box']")
	private WebElement checkBoxPage;
	
	@FindBy(className = "rct-checkbox")
	private WebElement checkbox;
	
	
	//RADIO BUTTONS List: //*[@id="app"]/div/div/div[2]/div[2]/div[2]/div/label
	@FindBy(xpath = "//*[text()='Radio Button']")
	private WebElement radioButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")
	private WebElement yesRadio;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")
	private WebElement impressiveRadio;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]/label")
	private WebElement noRadio;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div/label")
	private List<WebElement> radios;
	
	
	
	//WEB TABLES
	@FindBy(xpath = "//*[text()='Web Tables']")
	private WebElement webTables;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div")
	private List<WebElement> row1;
	
	@FindBy(id = "edit-record-1")
	private WebElement editBtnRow1;
	
	@FindBy(id = "delete-record-2")
	private WebElement deleteBtnRow1;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div/div")
	private List<WebElement> row2;
	
	@FindBy(id = "edit-record-2")
	private WebElement editBtnRow2;
	
	@FindBy(id = "delete-record-2")
	private WebElement deleteBtnRow2;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[3]/div/div")
	private List<WebElement> row3;
	
	@FindBy(id = "edit-record-3")
	private WebElement editBtnRow3;
	
	@FindBy(id = "delete-record-3")
	private WebElement deleteBtnRow3;
	
	@FindBy(id = "firstName")
	private WebElement rowFormFirstName;
	
	@FindBy(id = "lastName")
	private WebElement rowFormLastName;
	
	@FindBy(id = "userEmail")
	private WebElement rowFormEmail; 
	
	@FindBy(id = "age")
	private WebElement rowFormAge;
	
	@FindBy(id = "salary")
	private WebElement rowFormSalary;
	
	@FindBy(id = "department")
	private WebElement rowFormDepartment;
	
	@FindBy(id = "submit")
	private WebElement rowFormSubmitBtn;
	
	
	
	//BUTTONS
	@FindBy(xpath = "//*[text()='Buttons']")
	private WebElement buttons;
	
	@FindBy(id = "doubleClickBtn")
	private WebElement doubleClickBtn;
	
	@FindBy(id = "rightClickBtn")
	private WebElement rightClickBtn;
	
	@FindBy(xpath = "//button[text()='Click Me']")
	private WebElement dynamicBtn;
	
	@FindBy(id = "doubleClickMessage")
	private WebElement doubleClickMessage;
	
	@FindBy(id = "rightClickMessage")
	private WebElement rightClickMessage;
	
	@FindBy(id = "dynamicClickMessage")
	private WebElement dynamicClickMessage;
	
		
	//LINKS
	@FindBy(xpath = "//*[text()='Links']")
	private WebElement links;
	
	@FindBy(xpath = "//*[@id='linkWrapper']/p/a")
	private List<WebElement> linksList;
	
	@FindBy(linkText = "Home")
	private WebElement home;
	
	@FindBy(id = "dynamicLink")
	private WebElement homexncuk;
	
	@FindBy(linkText = "Created")
	private WebElement createdAPI;
	
	@FindBy(linkText = "No Content")
	private WebElement noContentAPI;
	
	@FindBy(linkText = "Moved")
	private WebElement movedAPI;
	
	@FindBy(linkText = "Bad Request")
	private WebElement badRequestAPI;
	
	@FindBy(linkText = "Unauthorized")
	private WebElement unauthorizedAPI;
	
	@FindBy(linkText = "Forbidden")
	private WebElement forbiddenAPI;
	
	@FindBy(linkText = "Not Found")
	private WebElement notFoundAPI;
	
	@FindBy(id = "linkResponse")
	private WebElement apiResponse;
	
	
	//BROKEN LINKS - IMAGES
	@FindBy(xpath = "//*[text()='Broken Links - Images']")
	private WebElement brokenLinks;
	
	@FindBy(linkText = "Click Here for Valid Link")
	private WebElement validLink;
	
	@FindBy(linkText = "Click Here for Broken Link")
	private WebElement brokenLink;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/p/text()[1]")
	private WebElement brokenLinkMsg;
	
	
	//UPLOAD AND DOWNLOAD
	@FindBy(xpath = "//*[text()='Upload and Download']")
	private WebElement uploadDownload;
	
	@FindBy(id = "downloadButton")
	private WebElement download;
	
	@FindBy(id = "uploadFile")
	private WebElement upload;
	
	
	//DYNAMIC PROPERTIES
	@FindBy(xpath = "//*[text()='Dynamic Properties']")
	private WebElement dynamicProperties;
	
	@FindBy(id = "enableAfter")
	private WebElement dynamicDisabledBtn;
	
	@FindBy(id = "colorChange")
	private WebElement colorChangeBtn;
	
	@FindBy(id = "visibleAfter")
	private WebElement dynamicInvisibleBtn;
	
	
	//TEXTBOX
	public WebElement textBox() {return textBox;}	
	public WebElement userName() {return userName;}
	public WebElement userEmail() {return userEmail;}
	public WebElement currentAddress() {return currentAddress;}
	public WebElement permanentAddress() {return permanentAddress;}		
	public WebElement submitButton() {return textBoxBtn;}
	public WebElement submittedName() {return submittedName;}	
	public WebElement submittedEmail() {return submittedEmail;}	
	public WebElement submittedCurrentAddress() {return submittedCurrentAddress;}
	public WebElement submittedPermanentAddress() {return submittedPermanentAddress;}
	
	//CHECKBOX
	public WebElement checkBox() {return checkBoxPage;}
	public WebElement checkbox() {return checkbox;}
	
	//RADIO BUTTON
	public WebElement radioButton() {return radioButton;}	
	public WebElement yesRadio() {return yesRadio;}
	public WebElement impressiveRadio() {return impressiveRadio;}
	public WebElement noRadio() {return noRadio;}
	public List<WebElement> radios() {return radios;}
	
	//WEB TABLES
	public WebElement webTables() {return webTables;}	
	public List<WebElement> row1(){return row1;}	
	public WebElement editBtnRow1() {return editBtnRow1;}	
	public WebElement deleteBtnRow1() {return deleteBtnRow1;}	
	public List<WebElement> row2(){return row2;}	
	public WebElement editBtnRow2() {return editBtnRow1;}	
	public WebElement deleteBtnRow2() {return deleteBtnRow1;}	
	public List<WebElement> row3(){return row1;}
	public WebElement editBtnRow3() {return editBtnRow1;}
	public WebElement deleteBtnRow3() {return deleteBtnRow1;}	
	public WebElement rowFormFirstName() {return rowFormFirstName;}
	public WebElement rowFormLasttName() {return rowFormLastName;}
	public WebElement rowFormEmail() {return rowFormEmail;}
	public WebElement rowFormAge() {return rowFormAge;}
	public WebElement rowFormSalary() {return rowFormSalary;}
	public WebElement rowFormDepartment() {return rowFormDepartment;}
	public WebElement rowFormSubmitBtn() {return rowFormSubmitBtn;}
		
	//BUTTONS
	public WebElement buttons() {return buttons;}	
	public WebElement doubleClickBtn() {return doubleClickBtn;}	
	public WebElement rightClickBtn() {return rightClickBtn;}	
	public WebElement dynamicBtn() {return dynamicBtn;}	
	public WebElement doubleClickMessage() {return doubleClickMessage;}	
	public WebElement rightClickMessage() {return rightClickMessage;}
	public WebElement dynamicClickMessage() {return dynamicClickMessage;}
	
	//LINKS
	public WebElement links() {return links;}	
	public List<WebElement> linksList() {return linksList;}
	public WebElement home() {return home;}	
	public WebElement homexncuk() {return homexncuk;}
	public WebElement createdAPI() {return createdAPI;}
	public WebElement noContentAPI() {return noContentAPI;}
	public WebElement movedAPI() {return movedAPI;}
	public WebElement badRequestAPI() {return badRequestAPI;}	
	public WebElement unauthorizedAPI() {return unauthorizedAPI;}
	public WebElement notFoundAPI() {return notFoundAPI;}	
	public WebElement apiResponse() {return apiResponse;}
		
	//BROKEN LINKS
	public WebElement brokenLinks() {return brokenLinks;}	
	public WebElement validLink() {return validLink;}
	public WebElement brokenLink() {return brokenLink;}
	public WebElement brokenLinkMsg() {return brokenLinkMsg;}
	
	//UPLOAD and DOWNLOAD
	public WebElement uploadDownload() {return uploadDownload;}
	public WebElement downloadButton() {return download;}
	public WebElement uploadButton() {return upload;}
	
	//DYNAMIC PROPERTIES
	public WebElement dynamicProperties() {return dynamicProperties;}
	public WebElement dynamicDisabledBtn() {return dynamicDisabledBtn;}
	public WebElement dynamicInvisibleBtn() {return dynamicInvisibleBtn;}
	public WebElement dynamiColorChangeBtn() {return colorChangeBtn;}
}

