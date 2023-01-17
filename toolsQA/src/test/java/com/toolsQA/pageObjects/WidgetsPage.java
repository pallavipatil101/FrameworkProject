package com.toolsQA.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WidgetsPage {
	WebDriver driver;
	
	public WidgetsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class = 'text'][text()='Accordian']")
	private WebElement accordian;
	
	@FindBy(id = "section1Heading")
	private WebElement accordinHeading1;
	
	@FindBy(xpath = "//*[@id=\"section1Content\"]/p")
	private WebElement accordianHeading1Msg;
	
	@FindBy(id = "section2Heading")
	private WebElement accordinHeading2;
	
	@FindBy(xpath = "//*[@id=\"section2Content\"]/p[1]")
	private WebElement accordianHeading2Msg;
	
	@FindBy(id = "section3Heading")
	private WebElement accordinHeading3;
	
	@FindBy(xpath = "//*[@id=\"section3Content\"]/p")
	private WebElement accordianHeading3Msg;
	
	
	
	//AUTO COMPLETE
	@FindBy(xpath = "//*[@class = 'text'][text()='Auto Complete']")
	private WebElement autoComplete;
	
	@FindBy(xpath = "//*[@id=\"autoCompleteSingleContainer\"]/div/div[1]")
	private WebElement typeSingleColor;
	
	@FindBy(xpath = "//*[@id=\"autoCompleteMultipleContainer\"]/div/div[1]")
	private WebElement typeMultipleColors;
	
	
	//DATE PICKER
	@FindBy(xpath = "//*[@class = 'text'][text()='Date Picker']")
	private WebElement datePicker;
	
	@FindBy(id = "datePickerMonthYearInput")
	private WebElement calender1;
	
	@FindBy(xpath = "//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")
	private WebElement calender1MonthBtn;
	
	@FindBy(xpath = "//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")
	private WebElement calender1YearBtn;
	
	@FindBy(xpath = "//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]")
	private WebElement calender1date;
	
	@FindBy(id = "dateAndTimePickerInput")
	private WebElement calender2;
	
	@FindBy(xpath = "//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/span[1]")
	private WebElement calender2MonthButton;
	
	@FindBy(xpath = "//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div")
	private List<WebElement> calender2MonthList;
	
	@FindBy(xpath= "//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/span[1]")
	private WebElement calender2YearButton;
		
	@FindBy(xpath = "//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div")
	private List<WebElement> calender2YearList;
	
	@FindBy(xpath = "//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]")
	private WebElement calender2Date;
		
	
	//SLIDER
	@FindBy(xpath = "//*[@class = 'text'][text()='Slider']")
	private WebElement slider;
	
	@FindBy(xpath = "//input[@class = 'range-slider range-slider--primary']")
	private WebElement sliderButton;
	
	
	//PROGRESS
	@FindBy(xpath = "//*[@class = 'text'][text()='Progress Bar']")
	private WebElement progressBar;
	
	@FindBy(id = "startStopButton")
	private WebElement startStopButton;
	
	@FindBy(xpath = "//*[@id = 'progressBar']/div")
	private WebElement trackProgress;
	
	
	//TABS
	@FindBy(xpath = "//*[@class = 'text'][text()='Tabs']")
	private WebElement tabs;
	
	@FindBy(xpath = "//*[@class ='nav nav-tabs']/a")
	private List<WebElement> tabsList;
	
	
	//TOOL TIPS
	@FindBy(xpath = "//*[@class = 'text'][text()='Tool Tips']")
	private WebElement toolTips;
	
	@FindBy(id = "toolTipButton")
	private WebElement toolTipButton;
	
	@FindBy(id = "toolTipTextField")
	private WebElement toolTipTextField;
	
	
	//MENU
	@FindBy(xpath = "//*[@class = 'text'][text()='Menu']")
	private WebElement menu;
	
	@FindBy(linkText = "Main Item 1")
	private WebElement menu1;
	
	@FindBy(linkText = "Main Item 2")
	private WebElement menu2;
	
	@FindBy(xpath = "//*[@id=\"nav\"]/li[2]/ul/li[1]/a")
	private WebElement subItem1;
	
	@FindBy(xpath = "//*[@id=\"nav\"]/li[2]/ul/li[2]/a")
	private WebElement subItem2;
	
	@FindBy(linkText = "SUB SUB LIST »")
	private WebElement subMenu;
	
	@FindBy(linkText = "Sub Sub Item 1")
	private WebElement subMenuItem1;
	
	@FindBy(linkText = "Sub Sub Item 2")
	private WebElement subMenuItem2;
	
	@FindBy(linkText = "Main Item 3")
	private WebElement menu3;
	
	
	//SELECT MENU
	@FindBy(xpath = "//*[@class = 'text'][text()='Select Menu']")
	private WebElement selectMenu;
	
	@FindBy(xpath = "//*[@id=\"withOptGroup\"]/div/div[1]/div[1]")
	private WebElement dropDown1Btn;
	
	@FindBy(xpath = "//*[@id=\"selectOne\"]/div/div[1]")
	private WebElement dropDown2Btn;
	
	@FindBy(id = "oldSelectMenu")
	private WebElement selectDropDown;
	
	@FindBy(xpath = "//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]")
	private WebElement multiSelectDropDown;
	
	@FindBy(id = "cars")
	private WebElement multiSelectDropDown2;
	
	//ACCORDIAN
	public WebElement accordian() {	return accordian;}
	public WebElement accordianHeading1() {	return accordinHeading1;}
	public WebElement accordianHeading1Msg(){return accordianHeading1Msg;}
	public WebElement accordianHeading2() {	return accordinHeading2;}
	public WebElement accordianHeading2Msg(){return accordianHeading2Msg;}
	public WebElement accordianHeading3() {	return accordinHeading3;}
	public WebElement accordianHeading3Msg(){return accordianHeading3Msg;}
		
	//AUTO COMPLETE
	public WebElement autoComplete() {return autoComplete;}
	public WebElement typeSingleColor() {return typeSingleColor;}
	public WebElement typeMultipleColors() {return typeMultipleColors;}
			
	//DATE PICKER
	public WebElement datePicker() {return datePicker;}
	public WebElement calender1() {return calender1;}
	public WebElement calender1MonthBtn() {return calender1MonthBtn;}
	public WebElement calender1YearBtn() {return calender1YearBtn;}
	public WebElement calender1date() {return calender1date;}
	public WebElement calender2() {return calender2;}
	public WebElement calender2MonthButton() {return calender2MonthButton;}
	public List<WebElement> calender2MonthList() {return calender2MonthList;}
	public WebElement calender2YearButton() {return calender2YearButton;}
	public List<WebElement> calender2YearList() {return calender2YearList;}
	public WebElement calender2Date() {return calender2Date;}	
		
	//SLIDER
	public WebElement slider() {return slider;}
	public WebElement sliderButton() {return sliderButton;}
	
	//PROGRESS BAR
	public WebElement progressBar() {return progressBar;}
	public WebElement progressBarButton() {return startStopButton;}
	public WebElement trackProgress() {return trackProgress;}	
	
	//TABS
	public WebElement tabs() {return tabs;}
	public List<WebElement> tabsList(){return tabsList;}
		
	//TOOL TIPS
	public WebElement toolTips() {return toolTips;}
	public WebElement toolTipButton() {return toolTipButton;}
	public WebElement toolTipTextField() {return toolTipTextField;}	
	
	//MENU
	public WebElement menu() {return menu;}
	public WebElement menu1() {return menu1;}
	public WebElement menu2() {return menu2;}
	public WebElement menu3() {return menu3;}
	public WebElement subItem1() {return subItem1;}
	public WebElement subItem2() {return subItem2;}
	public WebElement subMenu() {return subMenu;}
	public WebElement subMenuItem1() {return subMenuItem1;}
	public WebElement subMenuItem2() {return subMenuItem2;}
		
	//SELECT MENU
	public WebElement selectMenu() {return selectMenu;}
	public WebElement dropDown1Btn() {return dropDown1Btn;}
	public WebElement dropDown2Btn() {return dropDown2Btn;}
	public WebElement selectDropDown() {return selectDropDown;}
	public WebElement multiSelectDropDown() {return multiSelectDropDown;}
	public WebElement multiSelectDropDown2() {return multiSelectDropDown2;}
}
