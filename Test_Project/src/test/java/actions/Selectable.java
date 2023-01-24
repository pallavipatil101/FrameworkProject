package actions;

import org.openqa.selenium.WebElement;

import base.Base;
import locators.Selectable_locators;

public class Selectable extends Base {
	Selectable_locators sl = new Selectable_locators();
	
	public void select_all_list_options() {
		for(WebElement opt : sl.selectableListElements())
		{
			scroll_to_element(opt);
			opt.click();
		}
	}
	
	public void switch_to_grid() {
		for(WebElement tab : sl.selectableTabsList())
		{
			if(tab.getText().equals("Grid"))
			{
				tab.click();
			}
		}
	}
	
	public void verify_grid_options() {
		isTrue(sl.selectableGridElements().size()==9);
	}
	
	public void select_all_grid_options() {
		for(WebElement opt : sl.selectableGridElements())
		{
			scroll_to_element(opt);
			opt.click();
		}
	}
}
