package testcases;

import org.testng.annotations.Test;

import actions.AutoComplete;
import actions.HomePage;
import base.Base;

public class AutoComplete_Test extends Base{
	AutoComplete ac = new AutoComplete();
	
	@Test(priority = 0)
	public void navigate_to_autocomplete() {
		HomePage hp = new HomePage();
		hp.navigate_to_widgets().navigate_to_autocomplete();
	}
	
	@Test(priority = 1)
	public void go_to_multi_colors_textbox() {
		ac.go_to_multi_colors_textbox();
	}
	
	@Test(priority = 2)
	public void select_first_color() {
		ac.select_first_color();
	}
	
	@Test(priority = 3)
	public void select_second_color() {
		ac.select_second_color();
	}
	
	@Test(priority = 4)
	public void select_third_color() {
		ac.select_third_color();
	}
	
	@Test(priority = 5)
	public void go_to_single_color_textbox() {
		ac.go_to_single_color_textbox();
	}
	
	@Test(priority = 6)
	public void select_single_color() {
		ac.select_single_color();
	}
}
