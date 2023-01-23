package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.NestedFrames;
import base.Base;

public class NestedFrames_Test extends Base{
	NestedFrames nf = new NestedFrames();
	
	@Test(priority = 0)
	public void navigate_to_nested_frames() {
		HomePage hp = new HomePage();
		hp.navigate_to_alert_frames_windows().navigate_to_nested_frames();
	}
	
	@Test(priority = 1)
	public void switch_to_outer_frame() {
		nf.switch_to_outer_frame();
	}
	
	@Test(priority = 2)
	public void verify_outer_frame_text() {
		nf.verify_outer_frame_text();
	}
	
	@Test(priority = 3)
	public void switch_to_inner_frame() {
		nf.switch_to_inner_frame();
	}
	
	@Test(priority = 4)
	public void verify_inner_frame_text() {
		nf.verify_inner_frame_text();
	}
	
	@Test(priority = 5)
	public void switch_to_original_frame() {
		nf.switch_to_original_frame();
	}
}
