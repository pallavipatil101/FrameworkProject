package testcases;

import org.testng.annotations.Test;

import actions.Frames;
import actions.HomePage;
import base.Base;

public class Frames_Test extends Base {
	Frames fr = new Frames();
	
	@Test(priority = 0)
	public void navigate_to_frames() {
		HomePage hp = new HomePage();
		hp.navigate_to_alert_frames_windows().navigate_to_frames();
	}
	
	@Test(priority = 1)
	public void switch_to_frame1() {
		fr.switch_to_frame1();
	}
	
	@Test(priority = 2)
	public void verify_frame1_heading() {
		fr.verify_frame1_heading();
	}
	
	@Test(priority = 3)
	public void switch_to_original_frame() {
		fr.switch_to_original_frame();
	}
	
	@Test(priority = 4)
	public void switch_to_frame2() {
		fr.switch_to_frame2();
	}
	
	@Test(priority = 5)
	public void verify_frame2_heading() {
		fr.verify_frame2_heading();
	}
	
	@Test(priority = 6)
	public void switch_backto_original_frame() {
		fr.switch_to_original_frame();
	}
}
