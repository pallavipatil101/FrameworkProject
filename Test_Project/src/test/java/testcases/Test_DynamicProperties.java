package testcases;

import org.testng.annotations.Test;

import actions.DynamicProperties;
import actions.HomePage;
import base.Base;

public class Test_DynamicProperties extends Base{
	
	DynamicProperties dp = new DynamicProperties();
	
	@Test(priority = 0)
	public void navigateToDynamicProperties() {
		HomePage hp = new HomePage();	
		hp.navigate_to_Elements().navigate_to_dynamic_properties();
	}
	
	@Test(priority = 1)
	public void verifyDisabledBtn() {
		dp.verify_Disabled_Btn();
	}
	
	@Test(priority = 2)
	public void buttonColorBefore() {
		dp.btn_Color_Before();
	}
	
	@Test(priority = 3)
	public void waits() {
		dp.wait_Five_Seconds();
	}
	
	@Test(priority = 4)
	public void verifyEnabledBtn() {
		dp.verify_Enabled_Btn();
	}
	
	@Test(priority = 5)
	public void verifyBtnColorChange() {
		dp.verify_Button_Color_Change();
	}
	
	@Test(priority = 6)
	public void verifyVisibilityOfInvisibleBtn() {
		dp.verify_Visible_Btn();
	}
}
