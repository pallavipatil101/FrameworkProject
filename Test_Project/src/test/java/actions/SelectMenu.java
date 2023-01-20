package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Base;
import locators.SelectMenu_locators;

public class SelectMenu extends Base{
	SelectMenu_locators sm = new SelectMenu_locators();
	
	public void select_dropdown() {
		Select select = new Select(sm.selectDropDown());
		select.selectByVisibleText("Aqua");
	}
	
	public void standard_multi_select() {
		Select select = new Select(sm.standardMultiSelectDropDown());
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Audi");
	}
	
	public void multi_select() {
		sm.multiSelectDropDown().click();
		for(WebElement opt : sm.multiSelectOptions())
		{
			scroll_to_element(opt);
			if(opt.getText().equals("Blue"))
			{
				action().moveToElement(opt).click().build().perform();
			}
		}
		sm.blue().click();
	}
	
	
}
