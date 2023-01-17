package actions;

import base.Base;
import locators.Accordian_locators;

public class Accordian extends Base{
	Accordian_locators al = new Accordian_locators();
	
	public void click_on_heading1() {
		scroll_to_element(al.heading1());
		al.heading1().click();
	}
	
	public void verify_heading1_text() {
		isTrue(al.heading1Msg().getText().contains("Lorem Ipsum is simply dummy text"));
	}
	
	public void click_on_heading2() {
		scroll_to_element(al.heading2());
		al.heading2().click();
	}
	
	public void verify_heading2_text() {
		isTrue(al.heading2Msg().getText().contains("Contrary to popular belief, Lorem Ipsum"));
	}
	
	public void click_on_heading3() {
		scroll_to_element(al.heading3());
		al.heading3().click();
	}
	
	public void verify_heading3_text() {
		isTrue(al.heading3Msg().getText().contains("It is a long established fact that a reader"));
	}
}
