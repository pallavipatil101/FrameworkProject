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
	public void calender1() {
		dp.click_on_calender1();
		dp.select_year_calender1();
		dp.select_month_calender1();
		dp.select_date_calender1();
	}
	
	@Test(priority = 2, enabled = true)
	public void calender2() {
		dp.click_on_calender2();
		dp.select_year_calender2();
		dp.select_month_calender2();
		dp.select_date_calender2();
		dp.select_time_calender2();
	}
}
