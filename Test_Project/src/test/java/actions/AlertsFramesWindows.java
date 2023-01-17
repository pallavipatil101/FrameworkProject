package actions;

import base.Base;
import locators.AlertsFramesWindows_page_locators;

public class AlertsFramesWindows extends Base{
	AlertsFramesWindows_page_locators afw = new AlertsFramesWindows_page_locators();
	
	public Windows navigate_to_windows() {
		scroll_to_element(afw.windows());
		afw.windows().click();
		return new Windows();
	}
	
	public Alerts navigate_to_alerts() {
		scroll_to_element(afw.alerts());
		afw.alerts().click();
		return new Alerts();
	}
	
	public Frames navigate_to_frames() {
		scroll_to_element(afw.frames());
		afw.frames().click();
		return new Frames();
	}
	
	public NestedFrames navigate_to_nested_frames() {
		scroll_to_element(afw.nested_frames());
		afw.nested_frames().click();
		return new NestedFrames();
	}
	
	public Modals navigate_to_modals() {
		scroll_to_element(afw.modals());
		afw.modals().click();
		return new Modals();
	}
}
