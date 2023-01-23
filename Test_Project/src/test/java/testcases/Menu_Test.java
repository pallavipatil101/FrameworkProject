package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.Menu;
import base.Base;

public class Menu_Test extends Base {
	Menu mm = new Menu();
	
	@Test(priority = 0)
	public void navigate_to_menu() {
		HomePage hp = new HomePage();
		hp.navigate_to_widgets().navigate_to_menu();
	}
	
	@Test(priority = 1)
	public void hover_over_menu1() {
		mm.hover_over_menu1();
	}
	
	@Test(priority = 2)
	public void hover_over_menu3() {
		mm.hover_over_menu3();
	}
	
	@Test(priority = 3)
	public void hover_over_menu2() {
		mm.hover_over_menu2();
	}
	
	@Test(priority = 4)
	public void hover_over_menu2_item1() {
		mm.hover_over_menu2_item1();
	}
	
	@Test(priority = 5)
	public void hover_over_menu2_item2() {
		mm.hover_over_menu2_item2();
	}
	
	@Test(priority = 6)
	public void hover_over_submenu() {
		mm.hover_over_submenu();
	}
	
	@Test(priority = 7)
	public void hover_over_submenu_item1() {
		mm.hover_over_submenu_item1();
	}
	
	@Test(priority = 8)
	public void hover_over_submenu_item2() {
		mm.hover_over_submenu_item2();
	}
}
