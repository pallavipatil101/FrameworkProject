package testcases;

import org.testng.annotations.Test;

import actions.WebTable;
import actions.HomePage;
import base.Base;

public class Webtable_Test extends Base{
	public WebTable wt = new WebTable();
	
	@Test(priority = 0, enabled = true)
	public void printRow1() {
		HomePage hp = new HomePage();	
		hp.navigate_to_Elements().navigate_to_webtable().print_Row1();
	}
	
	@Test(priority = 1)
	public void editRow1() {
		wt.edit_Row1();
	}
	
	@Test(priority = 2)
	public void submitData() {
		wt.submit_form();
	}
	
	@Test(priority = 3)
	public void verifyEdits() {
		wt.verify_edit();
	}
}
