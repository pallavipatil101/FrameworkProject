package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class SelectMenu_locators extends Base {

	public WebElement valueDropDown() {
		return driver.findElement(By.xpath("//*[@id='withOptGroup']/div/div[1]/div[1]"));
	}
	
	public WebElement oneDropDown() {
		return driver.findElement(By.xpath("//*[@id='selectOne']/div/div[1]"));
	}
	
	public WebElement selectDropDown() {
		return driver.findElement(By.id("oldSelectMenu"));
	}
	
	public WebElement multiSelectDropDown() {
		return driver.findElement(By.xpath("//*[@id='selectMenuContainer']/div[7]/div/div/div/div[1]"));
	}
	
	public List<WebElement> multiSelectOptions(){
		return driver.findElements(By.xpath("//*[@class= 'css-26l3qy-menu']/div/div"));
	}
	
	public WebElement blue() {
		return driver.findElement(By.id("react-select-17-option-0"));
	}
	
	public WebElement standardMultiSelectDropDown() {
		return driver.findElement(By.id("cars"));
	}
}
