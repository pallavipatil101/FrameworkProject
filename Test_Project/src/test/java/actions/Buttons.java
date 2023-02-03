package actions;

import base.Base;
import locators.Buttons_locators;

public class Buttons extends Base {

	Buttons_locators bpl = new Buttons_locators();
	
	public void click_DoubledClick_Btn() {
		action().doubleClick(bpl.doubleClickBtn()).build().perform();
	}
	
	public void click_RightClick_Btn() {
		action().contextClick(bpl.rightClickBtn()).build().perform();
	}
	
	public void click_Dynamic_Btn() {
		action().moveToElement(bpl.dynamicBtn()).click().build().perform();
	}
	
	public void verify_Double_Click() {
		//scroll_to_element(bpl.dynamicClickMsg());
		verify_texts_equal("You have done a double click", bpl.doubleClickMsg());
	}
	
	public void verify_Right_Click() {
		verify_texts_equal("You have done a right click", bpl.rightClickMsg());
	}

	public void verify_Dynamic_Click() {
		verify_texts_equal("You have done a dynamic click", bpl.dynamicClickMsg());
	}
	
}
