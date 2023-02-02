package actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Base;
import locators.AutoComplete_locators;

public class AutoComplete extends Base{
	
	AutoComplete_locators ac = new AutoComplete_locators();
	
	public void go_to_multi_colors_textbox() {
		action().moveToElement(ac.multipleColors()).click().sendKeys("B").build().perform();
	}
	
	public void select_first_color() {
		action().keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	}
	
	public void select_second_color() {
		action().moveToElement(ac.multipleColors()).click().sendKeys("B").build().perform();
		action().keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	}
	
	public void go_to_single_color_textbox() {
		action().moveToElement(ac.singleColor()).click().sendKeys("R").build().perform();
	}
	
	public void select_single_color() {
		action().keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	}

	
}
