package testcases;

import org.testng.annotations.Test;

import actions.DatePicker;
import actions.HomePage;
import base.Base;

public class Datepicker_Test extends Base{
	DatePicker dp = new DatePicker();
	
	@Test(priority = 0)
	public void navigate_to_datepicker() {
		HomePage hp = new HomePage();
		hp.navigate_to_widgets().navigate_to_datepicker();
	}
	
	@Test(priority = 1)
	public void select_calender1() {
		dp.click_on_calender1();
	}
	
	@Test(priority = 2)
	public void select_year() {
		dp.select_year_calender1();
	}
	
	@Test(priority = 3)
	public void select_month() {
		dp.select_month_calender1();
	}
	
	@Test(priority = 4)
	public void select_date() {
		dp.select_date_calender1();
	}
	
	@Test(priority = 5, enabled = false)
	public void select_calender2() {
		dp.click_on_calender2();
	}
	
	@Test(priority = 6, enabled = false)
	public void select_year_calender2() {
		dp.select_year_calender2();
	}
	
	@Test(priority = 7, enabled = false)
	public void select_month_calender2() {
		dp.select_month_calender2();
	}
	
	@Test(priority = 5)
	public void calender2_date_time() {
		dp.select_calender2_date();
	}
}
