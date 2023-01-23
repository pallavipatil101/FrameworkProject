package testcases;

import org.testng.annotations.Test;
import actions.CheckBox;
import actions.Elements;
import actions.HomePage;
import base.Base;

public class Checkbox_Test extends Base{
	public CheckBox cb = new CheckBox();
	
	@Test(priority = 0)
	public void navigate_to_checkbox() {
		//HomePage hp = new HomePage();	
		//hp.navigate_to_Elements().navigate_to_checkbox();
		Elements e = new Elements();
		e.navigate_to_checkbox();
	}
	
	@Test(priority = 1)
	public void click_checkbox() {
		cb.click_Checkbox();
	}
	
	@Test(priority = 2)
	public void verifySelectedCheckBox() {
		cb.verify_Selected_CheckBox();
	}
}
