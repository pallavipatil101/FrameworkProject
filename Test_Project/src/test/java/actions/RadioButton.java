package actions;

import org.openqa.selenium.WebElement;
import base.Base;
import locators.RadioButton_locators;

public class RadioButton extends Base{

	RadioButton_locators rpl = new RadioButton_locators();
	
	public void click_RadioButton() {
		for(WebElement radio : rpl.radioButtonsList())
		{
			if(radio.getAttribute("for").equals("yesRadio"))
			{
				if(!radio.isSelected())
				{
					radio.click();
				}
			}
		}
	}
	
	public void verify_Radio_Result() {
		verify_text("Yes",rpl.radioButtonResult());
	}
	
	public void verify_Disabled_Radio() {
		for(WebElement radio : rpl.radioButtonsList())
		{
			if(radio.getAttribute("for").equals("noRadio"))
			{
				isTrue(!radio.isEnabled());
			}
		}
	}
}
