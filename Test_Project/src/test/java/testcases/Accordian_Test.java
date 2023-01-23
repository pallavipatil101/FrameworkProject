package testcases;

import org.testng.annotations.Test;
import actions.Accordian;
import actions.HomePage;
import base.Base;

public class Accordian_Test extends Base{
	
	Accordian ac = new Accordian();
	
	@Test(priority = 0)
	public void navigate_to_accordian() {
		HomePage hp = new HomePage();
		hp.navigate_to_widgets().navigate_to_accordian();
	}
	
	@Test(priority = 1)
	public void click_on_heading1() {
		ac.click_on_heading1();
	}
	
	@Test(priority = 2)
	public void verify_heading1_text() {
		ac.verify_heading1_text();
	}
	
	@Test(priority = 3)
	public void click_on_heading2() {
		ac.click_on_heading2();
	}
	
	@Test(priority = 4)
	public void verify_heading2_text() {
		ac.verify_heading2_text();
	}
	
	@Test(priority = 5)
	public void click_on_heading3() {
		ac.click_on_heading3();
	}
	
	@Test(priority = 6)
	public void verify_heading3_text() {
		ac.verify_heading3_text();
	}
}
