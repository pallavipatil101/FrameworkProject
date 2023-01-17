package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class BrokenLinks_locators extends Base{
	
	public WebElement validLink() {
		return driver.findElement(By.linkText("Click Here for Valid Link"));
	}
	
	public WebElement brokenLink() {
		return driver.findElement(By.linkText("Click Here for Broken Link"));
	}
	
	public WebElement brokenLinkMsg() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[1]"));
	}
	
	public List<WebElement> images(){
		return driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img"));
	}
	
}
