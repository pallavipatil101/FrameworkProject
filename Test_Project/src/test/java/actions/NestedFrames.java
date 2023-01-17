package actions;

import base.Base;
import locators.NestedFrames_locators;

public class NestedFrames extends Base {
	NestedFrames_locators nf = new NestedFrames_locators();
	
	public void switch_to_outer_frame() {
		driver.switchTo().frame(nf.parentFrame());
	}
	
	public void verify_outer_frame_text() {
		verify_text("Parent frame", nf.parentFrameText());
	}
	
	public void switch_to_inner_frame() {
		driver.switchTo().frame(0);
	}
	
	public void verify_inner_frame_text() {
		verify_text("Child Iframe", nf.childFrameText());
	}
	
	public void switch_to_original_frame() {
		driver.switchTo().defaultContent();
	}
}
