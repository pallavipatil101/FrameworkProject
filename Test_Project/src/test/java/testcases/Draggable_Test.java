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
	public void axis_tab_dragdrop() {
		dr.switch_to_axis_tab();
		dr.drag_along_x_axis();
		dr.drag_along_y_axis();
	}
	
	@Test(priority = 3)
	public void container_tab_dragdrop() {
		dr.switch_to_container_tab();
		dr.drag_box_contained();
		dr.drag_page_contained();
	}
}
