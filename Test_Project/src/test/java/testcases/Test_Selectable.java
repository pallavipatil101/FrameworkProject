package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.Selectable;
import base.Base;

public class Test_Selectable extends Base{
	Selectable se = new Selectable();
	
	@Test(priority = 0)
	public void navigate_to_selectable() {
		HomePage hp = new HomePage();
		hp.navigate_to_interactions().navigate_to_selectable();
	}
	
	@Test(priority = 1)
	public void select_all_list_options() {
		se.select_all_list_options();
	}
	
	@Test(priority = 2)
	public void switch_to_grid() {
		se.switch_to_grid();
	}
	
	@Test(priority = 3)
	public void verify_grid_options() {
		se.verify_grid_options();
	}
	
	@Test(priority = 4)
	public void select_all_grid_options() {
		se.select_all_grid_options();
	}
}
