package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import actions.CheckBox;
import actions.HomePage;
import base.Base;

public class Test_CheckBox extends Base{
	public CheckBox cb = new CheckBox();
	
	@Test
	public void clickCheckbox() {
		HomePage hp = new HomePage();	
		hp.navigate_to_Elements().navigate_to_checkbox().click_Checkbox();
		//driver.findElement(By.xpath("//*[text()='Check Box']")).click();
		//cb.click_Checkbox();
	}
	
	@Test
	public void verifySelectedCheckBox() {
		cb.verify_Selected_CheckBox();
	}
}
