package testcases;

import org.testng.annotations.Test;

import actions.Droppable;
import actions.HomePage;
import base.Base;

public class Test_Droppable extends Base{
	Droppable dr = new Droppable();
	
	@Test(priority = 0)
	public void navigate_to_droppable() {
		HomePage hp = new HomePage();
		hp.navigate_to_interactions().navigate_to_droppable();
	}
	
	@Test(priority = 1)
	public void simple_drag_drop() {
		dr.simple_drag_drop();
	}
	
	@Test(priority = 2)
	public void verify_simple_drop_successful() {
		dr.verify_simple_drop_successful();
	}
	
	@Test(priority = 3)
	public void switch_to_accept_tab() {
		dr.switch_to_accept_tab();
	}
	
	@Test(priority = 4)
	public void not_acceptable_drop() {
		dr.not_acceptable_drop();
	}
	
	@Test(priority = 5)
	public void verify_drag_not_accepted() {
		dr.verify_drag_not_accepted();
	}
	
	@Test(priority = 6)
	public void acceptable_drop() {
		dr.acceptable_drop();
	}
	
	@Test(priority = 7)
	public void verify_drag_accepted() {
		dr.verify_drag_accepted();
	}
	
	@Test(priority = 8)
	public void switch_to_prevent_propagation_tab() {
		dr.switch_to_propagation_tab();
	}
	
	@Test(priority = 9)
	public void greedy_inner_drag_drop() {
		dr.greedy_inner_drop();
	}
	
	@Test(priority = 10)
	public void verify_greedy_inner_text() {
		//not dropping
		dr.verify_greedy_inner_text();
	}
	
	@Test(priority = 10)
	public void verify_greedy_outer_text() {
		dr.verify_greedy_outer_text();
	}
	
	@Test(priority = 11)
	public void not_greedy_inner_drop() {
		dr.not_greedy_inner_drop();
	}
	
	@Test(priority = 12)
	public void verify_not_greedy_inner_text() {
		dr.verify_not_greedy_inner_text();
	}
	
	@Test(priority = 13)
	public void verify_not_greedy_outer_text() {
		dr.verify_not_greedy_outer_text();
	}
	
	@Test(priority = 14)
	public void switch_to_Revert_Draggable_tab() {
		dr.switch_to_revert_tab();
	}
	
	@Test(priority = 15)
	public void revertable_Drag_Drop() {
		dr.revertable_drag_location_before();
		dr.revertable_drag();
		dr.revertable_drag_location_after();
	}
	
	@Test(priority = 16)
	public void verify_revertable_drag_successful() {
		//Draggable location differs even after reverting back to original position
		dr.verify_revertable_drag_location();
	}
	
	@Test(priority = 17)
	public void not_revertable_Drag_Drop() {
		dr.not_revertable_drag_location_before();
		dr.not_revertable_drag();
		dr.not_revertable_drag_location_after();
	}
	
	@Test(priority = 18)
	public void verify_not_revertable_drag_successful() {
		dr.verify_not_revertable_drag_location();
	}
}
