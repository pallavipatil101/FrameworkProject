package com.toolsQA.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage {
	
	WebDriver driver;
	
	public FormsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='Forms']")
	private WebElement forms;
	
	@FindBy(xpath = "//*[text()='Practice Form']")
	private WebElement practiceForm;
	
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	@FindBy(id = "lastName")
	private WebElement lastName;
	
	@FindBy(id = "userEmail")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div/input")
	private List<WebElement> radioButtonsGender;
	
	@FindBy(id = "userNumber")
	private WebElement mobileNumber;
	
	@FindBy(id = "dateOfBirthInput")
	private WebElement calender;
	
	@FindBy(xpath = "//select[@class = 'react-datepicker__month-select']")
	private WebElement birthMonthDropDown;
	
	@FindBy(xpath = "//select[@class = 'react-datepicker__year-select']")
	private WebElement birthYearDropDown;
	
	@FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]")
	private WebElement birthDate;
	
	@FindBy(xpath = "//*[@id=\"subjectsContainer\"]/div/div[1]")
	private WebElement subject;
	
	@FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div/div/input")
	private List<WebElement> checkboxes;
	
	@FindBy(id = "uploadPicture")
	private WebElement uploadPhoto;
	
	@FindBy(id = "currentAddress")
	private WebElement address;
	
	@FindBy(id = "state")
	private WebElement state;
	
	@FindBy(id = "city")
	private WebElement city;
		
	
	public WebElement forms() {return forms;}	
	public WebElement practiceForm() {return practiceForm;}	
	public WebElement firstName() {return firstName;}	
	public WebElement lastName() {return lastName;}
	public WebElement email() {return email;}
	public List<WebElement> radiosGender() {return radioButtonsGender;}
	public WebElement mobileNumber() {return mobileNumber;}
	public WebElement calender() {	return calender;	}
	public WebElement birthMonthDropDown() {return birthMonthDropDown;}
	public WebElement birthYearDropDown() {return birthYearDropDown;}	
	public WebElement birthDate() {return birthDate;}
	public WebElement subject() {return subject;}
	public List<WebElement> checkBoxHobbies() {return checkboxes;}	
	public WebElement uploadPhoto() {return uploadPhoto;}
	public WebElement address() {return address;}	
	public WebElement cityDrop() {return city;}
	public WebElement stateDrop() {return state;}
}
