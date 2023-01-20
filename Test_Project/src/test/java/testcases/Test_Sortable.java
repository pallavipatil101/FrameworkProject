package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.Sortable;
import base.Base;

public class Test_Sortable extends Base{
	Sortable so = new Sortable();
	
	@Test(priority = 0)
	public void navigate_to_sortable() {
		HomePage hp = new HomePage();
		hp.navigate_to_interactions().navigate_to_sortable();
	}
	
	@Test(priority = 1)
	public void switch_to_grid() {
		so.switch_to_grid();
	}
	
	@Test(priority = 2)
	public void verify_grid_elements() {
		so.verify_grid_elements();
	}
	
	@Test(priority = 3)
	public void switch_to_list() {
		so.switch_to_list();
	}
	
	@Test(priority = 4)
	public void verify_list_elements() {
		so.verify_list_elements();
	}
}
