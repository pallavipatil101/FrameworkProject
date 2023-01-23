package testcases;

import org.testng.annotations.Test;

import actions.Draggable;
import actions.HomePage;
import base.Base;

public class Draggable_Test extends Base{
	Draggable dr = new Draggable();
	
	@Test(priority = 0)
	public void navigate_to_draggable() {
		HomePage hp = new HomePage();
		hp.navigate_to_interactions().navigate_to_draggable();
	}
	
	@Test(priority = 1)
	public void simple_drag() {
		dr.simple_drag();
	}
	
	@Test(priority = 2)
	public void switch_to_axis_tab() {
		dr.switch_to_axis_tab();
	}
	
	@Test(priority = 3)
	public void drag_along_x_axis() {
		dr.drag_along_x_axis();
	}
	
	@Test(priority = 4)
	public void drag_along_y_axis() {
		dr.drag_along_y_axis();
	}
	
	@Test(priority = 5)
	public void switch_to_container_tab() {
		dr.switch_to_container_tab();
	}
	
	@Test(priority = 6)
	public void drag_box_contained() {
		dr.drag_box_contained();
	}
	
	@Test(priority = 7)
	public void drag_page_contained() {
		dr.drag_page_contained();
	}
}
