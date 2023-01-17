package actions;

import base.Base;
import locators.Forms_page_locators;

public class Forms extends Base{
	Forms_page_locators fpl = new Forms_page_locators();
	
	public PracticeForm navigate_to_practiceform() {
		scroll_to_element(fpl.practiceForm());
		fpl.practiceForm().click();
		return new PracticeForm();
	}
}
