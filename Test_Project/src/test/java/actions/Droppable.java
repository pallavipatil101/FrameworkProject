package actions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.Base;
import locators.Droppable_locators;

public class Droppable extends Base{
	Droppable_locators drop = new Droppable_locators();
	public String locBefore;
	public String locAfter;
	
	
	public void simple_drag_drop() {
		verify_texts_equal("Drop here", drop.droppedMessageSimple());
		action().dragAndDrop(drop.draggableSimple(), drop.droppableSimple()).build().perform();
	}
	
	public void verify_simple_drop_successful() {
		verify_texts_equal("Dropped!", drop.droppedMessageSimple());
	}
	
	public void switch_to_accept_tab() {
		for(WebElement tab : drop.droppableTabsList())
		{
			if(tab.getText().equals("Accept"))
			{
				tab.click();
			}
		}
	}
	
	public void not_acceptable_drop() {
		//scroll_to_element(drop.droppableAccept());
		verify_texts_equal("Drop here", drop.droppedMessageAccept());
		action().dragAndDrop(drop.draggableNotAcceptable(), drop.droppableAccept()).build().perform();
	}
	
	public void verifropy_not_accepted_drop() {
		verify_texts_equal("Drop here", drop.droppedMessageAccept());
	}
	
	public void acceptable_drop() {
		verify_texts_equal("Drop here", drop.droppedMessageAccept());
		action().dragAndDrop(drop.draggableAcceptable(), drop.droppableAccept()).build().perform();
	}
	
	public void verify_drag_accepted() {
		verify_texts_equal("Dropped!", drop.droppedMessageAccept());
	}
	
	public void switch_to_propagation_tab() {
		for(WebElement tab : drop.droppableTabsList())
		{
			if(tab.getText().equals("Prevent Propogation"))
			{
				tab.click();
			}
		}
	}
	
	public void greedy_inner_drop() {
		scroll_to_element(drop.droppableInnerGreedy());
		verify_texts_equal("Inner droppable (greedy)", drop.innerGreedyMessage());
		action().dragAndDrop(drop.draggablePreventPropagation(), drop.droppableInnerGreedy()).build().perform();
	}
	
	public void verify_greedy_inner_text() {
		scroll_to_element(drop.innerGreedyMessage());
		verify_texts_equal("Dropped!", drop.innerGreedyMessage());
	}
	
	public void verify_greedy_outer_text() {
		verify_texts_equal("Outer droppable", drop.outerGreedyMessage());
	}
	
	public void not_greedy_inner_drop() {
		scroll_to_element(drop.droppableOuterNotGreedy());
		verify_texts_equal("Inner droppable (not greedy)", drop.innerNotGreedyMessage());
		action().dragAndDrop(drop.draggablePreventPropagation(), drop.droppableInnerNotGreedy()).build().perform();
	}
	
	public void verify_not_greedy_inner_text() {
		verify_texts_equal("Dropped!", drop.innerNotGreedyMessage());
	}
	
	public void verify_not_greedy_outer_text() {
		verify_texts_equal("Dropped!", drop.outerNotGreedyMessage());
	}
	
	public void switch_to_revert_tab() {
		for(WebElement tab : drop.droppableTabsList())
		{
			if(tab.getText().equals("Revert Draggable"))
			{
				tab.click();
			}
		}
	}
	
	public void revertable_drag_location_before() {
		locBefore = drop.draggableRevertable().getAttribute("style");
	}
	
	public void revertable_drag() {
		scroll_to_element(drop.draggableRevertable());
		action().dragAndDrop(drop.draggableRevertable(), drop.droppableRevert()).build().perform();
	}
	
	public void revertable_drag_location_after() {
		locAfter = drop.draggableRevertable().getAttribute("style");
	}
	
	public void verify_revertable_drag_location() {
		Assert.assertNotEquals(locBefore, locAfter);
	}

	public void not_revertable_drag_location_before() {
		locBefore = drop.draggableNotRevertable().getAttribute("style");
	}
	
	public void not_revertable_drag() {
		action().dragAndDrop(drop.draggableNotRevertable(), drop.droppableRevert()).build().perform();
	}
	
	public void not_revertable_drag_location_after() {
		locAfter = drop.draggableNotRevertable().getAttribute("style");
	}

	public void verify_not_revertable_drag_location() {
		Assert.assertNotEquals(locBefore, locAfter);
	}
}
