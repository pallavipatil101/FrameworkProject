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
		scroll_to_element(al.heading1Msg());
		isTrue(al.heading1Msg().getText().contains("Lorem Ipsum is simply dummy text"));
	}
	
	public void click_on_heading2() {
		scroll_to_element(al.heading2());
		al.heading2().click();
	}
	
	public void verify_heading2_text() {
		scroll_to_element(al.heading2Msg());
		waitImplicitly();
		isTrue(al.heading2Msg().getText().contains("Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\""));
	}
	
	public void click_on_heading3() {
		scroll_to_element(al.heading3());
		al.heading3().click();
	}
	
	public void verify_heading3_text() {
		scroll_to_element(al.heading3Msg());
		waitImplicitly();
		isTrue(al.heading3Msg().getText().contains("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout."));
	}
}
