package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Base;
import locators.DynamicProperties_locators;

public class DynamicProperties extends Base{
	public String colorBefore;
	DynamicProperties_locators dpl = new DynamicProperties_locators();
	
	public void verify_Disabled_Btn() {
		isFalse(dpl.disabledBtn().isEnabled());
	}
	
	public void btn_Color_Before() {
		colorBefore = dpl.colorChangeBtn().getCssValue("color");
	}
	
	public void wait_Five_Seconds() {
		waiting().until(ExpectedConditions.elementToBeClickable(dpl.disabledBtn()));
	}
	
	public void verify_Enabled_Btn() {
		isTrue(dpl.disabledBtn().isEnabled());
	}
	
	public void verify_Button_Color_Change() {
		String colorAfter = dpl.colorChangeBtn().getCssValue("color");
		stringsNotEqual(colorBefore, colorAfter);
	}
	
	public void verify_Visible_Btn() {
		isTrue(dpl.invisibleBtn().isDisplayed());
	}
	
	
}
