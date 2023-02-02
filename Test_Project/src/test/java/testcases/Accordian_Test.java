package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import actions.Accordian;
import actions.HomePage;
import base.Base;

public class Accordian_Test extends Base{
	
	Accordian ac = new Accordian();
	public Logger log = LogManager.getLogger(Accordian_Test.class.getName());
	
	@Test(priority = 0)
	public void navigate_to_accordian() {
		HomePage hp = new HomePage();
		hp.navigate_to_widgets().navigate_to_accordian();
		log.debug("Navigated to accordian page.");
	}
	
	@Test(priority = 1)
	public void heading1() {
		ac.click_on_heading1();
		ac.verify_heading1_text();
		log.debug("Clicked on heading1 and verified it.");
	}
	
	@Test(priority = 2)
	public void heading2() {
		ac.click_on_heading2();
		ac.verify_heading2_text();
		log.debug("Clicked on heading2 and verified it.");
	}
	
	@Test(priority = 3)
	public void heading3() {
		ac.click_on_heading3();
		ac.verify_heading3_text();
		log.info("Clicked on heading3 and verified it.");
	}
}
