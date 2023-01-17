package actions;

import base.Base;
import locators.ToolTips_locators;

public class ToolTips extends Base{
	ToolTips_locators tt = new ToolTips_locators();
	
	public void hover_over_button() {
		action().moveToElement(tt.hoverOverBtn()).build().perform();
	}
	
	public void hover_over_textbox() {
		action().moveToElement(tt.hoverOverTextbox()).build().perform();
	}
}
