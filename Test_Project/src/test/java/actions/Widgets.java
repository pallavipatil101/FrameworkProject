package actions;

import base.Base;
import locators.Widget_page_locators;

public class Widgets extends Base {

	Widget_page_locators wpl = new Widget_page_locators();
	
	public Accordian navigate_to_accordian() {
		scroll_to_element(wpl.accordian());
		wpl.accordian().click();
		return new Accordian();
	}
	
	public AutoComplete navigate_to_autocomplete() {
		scroll_to_element(wpl.autoComplete());
		wpl.autoComplete().click();
		return new AutoComplete();
	}
	
	public DatePicker navigate_to_datepicker() {
		scroll_to_element(wpl.datePicker());
		wpl.datePicker().click();
		return new DatePicker();
	}
	
	public Slider navigate_to_slider() {
		scroll_to_element(wpl.slider());
		wpl.slider().click();
		return new Slider();
	}
	
	public ProgressBar navigate_to_progressbar() {
		scroll_to_element(wpl.progreeBar());
		wpl.progreeBar().click();
		return new ProgressBar();
	}
	
	public Tabs navigate_to_tabs() {
		scroll_to_element(wpl.tabs());
		wpl.tabs().click();
		return new Tabs();
	}
	
	public ToolTips navigate_to_tooltips() {
		scroll_to_element(wpl.toolTips());
		wpl.toolTips().click();
		return new ToolTips();
	}
	
	public Menu navigate_to_menu() {
		scroll_to_element(wpl.menu());
		wpl.menu().click();
		return new Menu();
	}
	
	public SelectMenu navigate_to_selectmenu() {
		scroll_to_element(wpl.selectMenu());
		wpl.selectMenu().click();
		return new SelectMenu();
	}
}
