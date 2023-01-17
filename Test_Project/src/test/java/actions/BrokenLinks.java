package actions;

import org.openqa.selenium.WebElement;

import base.Base;
import locators.BrokenLinks_locators;

public class BrokenLinks extends Base{
	
	BrokenLinks_locators bll = new BrokenLinks_locators();
	
	public void click_Valid_Link() {
		bll.validLink().click();
		driver.navigate().back();
	}
	
	public void click_Broken_Link() {
		bll.brokenLink().click();
	}
	
	public void verifyBrokenLink() {
		verify_text("This page returned a 500 status code.\n"
				+ "\n"
				+ "For a definition and common list of HTTP status codes, go here", bll.brokenLinkMsg());
		driver.navigate().back();
	}
	
	public void verifyImages() {
		for(WebElement img : bll.images())
		{}
	}
}
