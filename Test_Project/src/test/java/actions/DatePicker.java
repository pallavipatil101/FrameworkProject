package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.Base;
import locators.DatePicker_locators;

public class DatePicker extends Base{
	DatePicker_locators dp = new DatePicker_locators();
	
	public void click_on_calender1() {
		dp.calender1().click();
	}
	
	public void select_month_calender1() {
		Select select = new Select(dp.calender1MonthSelect());
		select.selectByVisibleText("March");
	}
	
	public void select_year_calender1() {
		Select select = new Select(dp.calender1YearSelect());
		select.selectByVisibleText("1996");
	}
	
	public void select_date_calender1() {
		dp.calender1Date().click();
	}
	
	public void click_on_calender2() {
		dp.calender2().click();
		
	}
	
	public void select_month_calender2() {
		dp.calender2MonthBtn().click();
		for(WebElement m : dp.calender2MonthList())
		{
			waiting().until(ExpectedConditions.elementToBeClickable(m));
			if(m.getText().equals("March"))
			{
				m.click();
				break;
			}
		}
	}
	
	public void select_year_calender2() {
		dp.calender2YearBtn().click();
		for(int i=1; i<24; i++)
		{
			dp.calender2YearArrow().click();
		}
		
		for(WebElement m : dp.calender2YearList())
		{
			waiting().until(ExpectedConditions.elementToBeClickable(m));
			if(m.getText().equals("1996"))
			{
				m.click();
				break;
			}
		}
	}
	
	public void select_date_calender2() {
		dp.calender2Date().click();
	}
	
	public void select_time_calender2() {
		for(WebElement time : dp.calender2TimeList())
		{
			if(time.getText().equals("16:30"))
			{
				time.click();
				break;
			}
		}
	}
}
