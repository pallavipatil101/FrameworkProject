package actions;

import org.openqa.selenium.WebElement;

import base.Base;
import locators.Draggable_locators;

public class Draggable extends Base{
	Draggable_locators drag = new Draggable_locators();
	
	public void simple_drag() {
		action().dragAndDropBy(drag.draggableSimple(), 100, 100).build().perform();
	}
	
	public void switch_to_axis_tab() {
		for(WebElement tab : drag.draggableTabsList())
		{
			if(tab.getText().equals("Axis Restricted"))
			{
				tab.click();
			}
		}
	}
	
	public void drag_along_x_axis() {
		action().dragAndDropBy(drag.draggableXAxis(), 100, 0).build().perform();
	}
	
	public void drag_along_y_axis() {
		action().dragAndDropBy(drag.draggableYAxis(), 0, 60).build().perform();
	}
	
	public void switch_to_container_tab() {
		for(WebElement tab : drag.draggableTabsList())
		{
			if(tab.getText().equals("Container Restricted"))
			{
				tab.click();
			}
		}
	}
	
	public void drag_box_contained() {
		action().dragAndDropBy(drag.draggableBoxContained(), 100, 30).build().perform();
	}
	
	public void drag_page_contained() {
		scroll_to_element(drag.draggablePageContained());
		action().dragAndDropBy(drag.draggablePageContained(), 20, 30).build().perform();
	}
	
	public void switch_to_curser_style_tab() {
		for(WebElement tab : drag.draggableTabsList())
		{
			if(tab.getText().equals("Cursor Style"))
			{
				tab.click();
			}
		}
	}
	
	public void drag_center_curser() {
		action().dragAndDropBy(drag.draggableCursorCenter(), 230, 140).build().perform();
	}
	
	public void drag_topleft_curser() {
		action().dragAndDropBy(drag.draggableCursorTopLeft(), 0, -140).build().perform();
	}
	
	public void drag_bottom_curser() {
		
	}
}
