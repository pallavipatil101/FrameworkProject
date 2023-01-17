package actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Base;
import locators.Alerts_locators;

public class Alerts extends Base {
	
	Alerts_locators a = new Alerts_locators();
	
	public void click_on_simple_alert() {
		a.simpleAlert().click();
	}
	
	public void handle_simple_alert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void click_on_delay_alert() {
		a.delayAlert().click();
	}
	
	public void handle_delay_alert() {
		waiting().until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void click_on_confirm_alert() {
		a.confirmAlert().click();
	}
	
	public void handle_confirm_alert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void verify_confirm_alert_msg() {
		verify_text("You selected Ok",a.confirmAlertMsg());
	}
	
	public void click_on_prompt_alert() {
		a.promptAlert().click();
	}
	
	public void handle_prompt_alert() {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hello");
		alert.accept();
	}
	
	public void verify_prompt_alert_msg() {
		verify_text("You entered Hello",a.promptAlertMsg());
	}
	
}
