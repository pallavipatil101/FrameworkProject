package actions;

import org.openqa.selenium.WebElement;

import base.Base;
import locators.Sortable_locators;

public class Sortable extends Base{
	Sortable_locators so = new Sortable_locators();
	
	public void switch_to_grid() {
		for(WebElement tab : so.sortableTabsList())
		{
			if(tab.getText().equals("Grid"))
			{
				tab.click();
			}
		}
	}
	
	public void verify_grid_elements() {
		isTrue(so.sortableGridElements().size() == 9);
	}
	
	public void switch_to_list() {
		for(WebElement tab : so.sortableTabsList())
		{
			if(tab.getText().equals("List"))
			{
				tab.click();
			}
		}
	}
	
	public void verify_list_elements() {
		isTrue(so.sortableListElements().size() == 6);
	}
}
