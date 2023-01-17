package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class DatePicker_locators extends Base{
	
	public WebElement calender1() {
		return driver.findElement(By.id("datePickerMonthYearInput"));
	}
	
	public WebElement calender1MonthSelect() {
		return driver.findElement(By.xpath("//*[@id='datePickerMonthYear']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
	}
	
	public WebElement calender1YearSelect() {
		return driver.findElement(By.xpath("//*[@id='datePickerMonthYear']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
	}
	
	public WebElement calender1Date() {
		return driver.findElement(By.xpath("//*[@id='datePickerMonthYear']/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]"));
	}
	
	public WebElement calender2() {
		return driver.findElement(By.id("dateAndTimePickerInput"));
	}
	
	public List<WebElement> calender1MonthList() {
		return driver.findElements(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div"));
	}
	
	public List<WebElement> calender1YearList() {
		return driver.findElements(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div"));
	}
	
	public WebElement calender2Date() {
		return driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]"));
	}
}
