package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class AutoComplete_locators extends Base {
	
	public WebElement singleColor() {
		return driver.findElement(By.xpath("//*[@id='autoCompleteSingleContainer']/div/div[1]"));
	}
	
	public WebElement MultipleColors() {
		return driver.findElement(By.xpath("//*[@id='autoCompleteMultipleContainer']/div/div[1]"));
	}
}
