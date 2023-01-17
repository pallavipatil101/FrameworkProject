package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class SelectMenu_locators extends Base {

	public WebElement dropDown1() {
		return driver.findElement(By.xpath("//*[@id='withOptGroup']/div/div[1]/div[1]"));
	}
	
	public WebElement dropDown2() {
		return driver.findElement(By.xpath("//*[@id='selectOne']/div/div[1]"));
	}
	
	public WebElement selectDropDown() {
		return driver.findElement(By.id("oldSelectMenu"));
	}
	
	public WebElement multiSelectDropDown1() {
		return driver.findElement(By.xpath("//*[@id='selectMenuContainer']/div[7]/div/div/div/div[1]"));
	}
	
	public WebElement multiSelectDropDown2() {
		return driver.findElement(By.id("cars"));
	}
}
