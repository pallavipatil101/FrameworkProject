package actions;

import base.Base;
import locators.Home_page_locators;

public class HomePage extends Base {
	
	Home_page_locators hpl = new Home_page_locators();
	
	public Elements navigate_to_Elements() {
		scroll_to_element(hpl.element());
		hpl.element().click();
		return new Elements();
	}
	
	public Forms navigate_to_forms() {
		scroll_to_element(hpl.forms());
		hpl.forms().click();
		return new Forms();
	}
	
	public AlertsFramesWindows navigate_to_alert_frames_windows() {
		scroll_to_element(hpl.alerts_frames_windows());
		hpl.alerts_frames_windows().click();
		return new AlertsFramesWindows();
	}
	
	public Widgets navigate_to_widgets() {
		scroll_to_element(hpl.widgets());
		hpl.widgets().click();
		return new Widgets();
	}
	
	public Interactions navigate_to_interactions() {
		scroll_to_element(hpl.interactions());
		hpl.interactions().click();
		return new Interactions();
	}
}
