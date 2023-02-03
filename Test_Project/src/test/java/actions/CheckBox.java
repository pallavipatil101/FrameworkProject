package actions;

import base.Base;
import locators.CheckBox_locators;

public class CheckBox extends Base{
	CheckBox_locators cpl = new CheckBox_locators();
	
	public void click_Checkbox() {
		if(!cpl.checkbox().isSelected())
		{
			cpl.checkbox().click();
		}
	}
	
	public void verify_Selected_CheckBox() {
		verify_texts_equal("You have selected :", cpl.chechbox_Result());
	}
}
