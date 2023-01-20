package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.Windows;
import base.Base;

public class Test_Windows extends Base{
	Windows win = new Windows();
	
	@Test(priority = 0)
	public void navigate_to_windows() {
		HomePage hp = new HomePage();
		hp.navigate_to_alert_frames_windows().navigate_to_windows();
	}
	
	@Test(priority = 1, enabled=true)
	public void open_new_tab() {
		win.open_new_tab();
	}
	
	@Test(priority = 2, enabled=true)
	public void switch_to_new_tab() {
		win.switch_to_newwindow();
	}
	
	@Test(priority = 3, enabled=true)
	public void verify_newtab_heading() {
		win.verify_newtab_heading();
	}
	
	@Test(priority = 4, enabled=true)
	public void switch_to_original_tab() {
		win.switch_to_parentwindow();
	}
	
	@Test(priority = 5, enabled=true)
	public void open_new_window() {
		win.open_new_window();
	}
	
	@Test(priority = 6, enabled=true)
	public void switch_to_new_window() {
		win.switch_to_newwindow();
	}
	
	@Test(priority = 7, enabled=true)
	public void verify_newwindow_heading() {
		win.verify_newwindow_heading();
	}
	
	@Test(priority = 8, enabled=true)
	public void switch_to_parent_window() {
		win.switch_to_parentwindow();
	}
	
	@Test(priority = 9)
	public void open_new_msg_window() {
		win.open_msg_window();
	}
	
	@Test(priority = 10)
	public void switch_to_new_msg_window() {
		win.switch_to_newwindow();
	}
	
	@Test(priority = 11)
	public void verify_msgwindow_text() {
		win.verify_msgwindow_heading();
	}
	
	@Test(priority = 12)
	public void switch_to_original_window() {
		win.switch_to_parentwindow();
	}
}
