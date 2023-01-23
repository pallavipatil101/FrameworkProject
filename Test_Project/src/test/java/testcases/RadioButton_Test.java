package testcases;

import org.testng.annotations.Test;

import actions.RadioButton;
import actions.HomePage;
import base.Base;

public class RadioButton_Test extends Base {
	public RadioButton rb = new RadioButton();
	@Test(priority = 0)
	public void clickRadioButton() {
		HomePage hp = new HomePage();	
		hp.navigate_to_Elements().navigate_to_radioButtons().click_RadioButton();
	}
	
	@Test(priority = 1, enabled = true)
	public void verifyResult() {
		rb.verify_Radio_Result();
	}
	
	@Test(priority = 3)
	public void verifyDisabledRadio() {
		rb.verify_Disabled_Radio();
	}
}
