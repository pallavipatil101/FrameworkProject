package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.SelectMenu;
import base.Base;

public class Test_SelectMenu extends Base{
	SelectMenu sm = new SelectMenu();
	
	@Test(priority = 0)
	public void naviagate_to_selectmenu() {
		HomePage hp = new HomePage();
		hp.navigate_to_widgets().navigate_to_selectmenu();
	}
	
	/*@Test(priority = 1)
	public void select_dropdown() {
		sm.select_dropdown();
	}
	
	@Test(priority = 2)
	public void standard_multiselect() {
		sm.standard_multi_select();
	}*/
	
	@Test(priority = 3)
	public void multi_select() {
		sm.multi_select();
	}
}
