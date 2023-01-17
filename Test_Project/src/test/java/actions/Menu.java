package actions;

import base.Base;
import locators.Menu_locators;

public class Menu extends Base{
	Menu_locators mm = new Menu_locators();
	
	public void hover_over_menu1() {
		action().moveToElement(mm.menu1()).build().perform();
	}
	
	public void hover_over_menu3() {
		action().moveToElement(mm.menu3()).build().perform();
	}
	
	public void hover_over_menu2() {
		action().moveToElement(mm.menu2()).build().perform();
	}
	
	public void hover_over_menu2_item1() {
		action().moveToElement(mm.menu2_Item1()).build().perform();
	}
	
	public void hover_over_menu2_item2() {
		action().moveToElement(mm.menu2_Item2()).build().perform();
	}
	
	public void hover_over_submenu() {
		action().moveToElement(mm.menu2_Submenu()).build().perform();
	}
	
	public void hover_over_submenu_item1() {
		action().moveToElement(mm.submenu_Item1()).build().perform();
	}
	
	public void hover_over_submenu_item2() {
		action().moveToElement(mm.submenu_Item2()).build().perform();
	}
}
