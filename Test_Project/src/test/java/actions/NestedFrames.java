package actions;

import base.Base;
import locators.NestedFrames_locators;

public class NestedFrames extends Base {
	NestedFrames_locators nf = new NestedFrames_locators();
	
	public void switch_to_outer_frame() {
		switch_to_frame(nf.parentFrame());
	}
	
	public void verify_outer_frame_text() {
		verify_texts_equal("Parent frame", nf.parentFrameText());
	}
	
	public void switch_to_inner_frame() {
		switch_to_frame(0);
	}
	
	public void verify_inner_frame_text() {
		verify_texts_equal("Child Iframe", nf.childFrameText());
	}
	
	public void switch_to_original_frame() {
		switch_to_default_frame();
	}
}
