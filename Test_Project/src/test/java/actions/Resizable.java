package actions;

import base.Base;
import locators.Resizable_locators;

public class Resizable extends Base{
	Resizable_locators rl = new  Resizable_locators();
	
	public void resizable_box_contained() {
		scroll_to_element(rl.resize1());
		action().moveToElement(rl.resize1()).clickAndHold().build().perform();
		action().dragAndDropBy(rl.resize1(), 160, 160).build().perform();
	}
	
	public void resizable_page_contained() {
		scroll_to_element(rl.resize2());
		action().moveToElement(rl.resize2()).clickAndHold().build().perform();
		action().dragAndDropBy(rl.resize2(), 150, 300).build().perform();
	}
}
