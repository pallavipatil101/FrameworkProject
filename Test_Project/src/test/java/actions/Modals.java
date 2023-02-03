package actions;

import base.Base;
import locators.Modals_locators;

public class Modals extends Base {
	Modals_locators md = new Modals_locators();
	
	public void open_small_modal() {
		md.smallModal().click();
	}
	
	public void verify_small_modal_text() {
		scroll_to_element(md.smallModaltext());
		verify_texts_equal("This is a small modal. It has very less content", md.smallModaltext());
	}
	
	public void close_small_modal() {
		md.closeSmallModal().click();
	}
	
	public void open_large_modal() {
		md.largeModal().click();
	}
	
	public void verify_large_modal_text() {
		scroll_to_element(md.largeModaltext());
		isTrue(md.largeModaltext().getText().contains("Lorem Ipsum is simply dummy text"));
	}
	
	public void close_large_modal() {
		md.closeLargeModal().click();
	}
}
