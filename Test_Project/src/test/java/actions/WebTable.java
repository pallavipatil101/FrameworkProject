package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Base;
import locators.WebTable_locators;

public class WebTable extends Base {
	
	WebTable_locators wpl = new WebTable_locators();
	
	public void print_Row1() {
		for(WebElement row : wpl.tableRow1())
		{
			System.out.print(row.getText()+"--");
		}
		System.out.println();
	}
	
	public void edit_Row1() {
		wpl.editRow1().click();
		waiting().until(ExpectedConditions.elementToBeClickable(wpl.firstName()));
		wpl.firstName().clear();
		send(wpl.firstName(), "Pallavi");
		wpl.lastName().clear();
		send(wpl.lastName(), "Patil");
		wpl.email().clear();
		send(wpl.email(), "Pallavi@joshsoftware.com");
		wpl.age().clear();
		send(wpl.age(),"26");
		wpl.salary().clear();
		send(wpl.salary(), "11111");
		wpl.department().clear();
		send(wpl.department(), "Quality Assurance");
		wpl.submitBtn().click();
	}
	
	public void verify_edit() {
		for(WebElement row : wpl.tableRow1())
		{
			System.out.print("--"+row.getText());
		}
		System.out.println();
	}
	
}
