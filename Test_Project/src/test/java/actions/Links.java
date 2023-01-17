package actions;

import org.openqa.selenium.WebElement;

import base.Base;
import locators.Links_locators;

public class Links extends Base {
	Links_locators lpl = new Links_locators();
	
	public void click_Links() {
		
		String parent = driver.getWindowHandle();
		for(WebElement link : lpl.linksList())
		{
			link.click();
		}
		
		driver.switchTo().window(parent);
	}
	
	
}
