package testcases;

import org.testng.annotations.Test;

import actions.Buttons;
import actions.HomePage;
import base.Base;

public class Test_Buttons extends Base {
	public Buttons btn = new Buttons();
	
	@Test(priority = 0)
	public void navigateToButtons() {
		HomePage hp = new HomePage();	
		//hp.navigate_to_Elements().navigate_to_buttons().click_Buttons(); 
		hp.navigate_to_Elements().navigate_to_buttons();
	}
	
	
	@Test(priority = 1)
	public void doubleClick() {
		btn.click_DoubledClick_Btn();
	}
	
	@Test(priority = 2)
	public void rightClick() {
		btn.click_RightClick_Btn();
	}
	
	@Test(priority = 3)
	public void dynamicClick() {
		btn.click_Dynamic_Btn();
	}
	
	@Test(priority = 4)
	public void verifyDoubleClick() {
		btn.verify_Double_Click();
	}
	
	@Test(priority = 5)
	public void verifyRightClick() {
		btn.verify_Right_Click();
	}
	
	@Test(priority = 6)
	public void verifyDynamicClick() {
		btn.verify_Dynamic_Click();
	}
	
}
