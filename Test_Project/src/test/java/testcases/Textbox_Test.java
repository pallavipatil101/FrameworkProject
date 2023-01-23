package testcases;

import org.testng.annotations.Test;

import actions.TextBox;
import actions.HomePage;
import base.Base;

public class Textbox_Test extends Base{
	public TextBox tb = new TextBox();
	
	@Test(priority =0)
	public void navigate_to_textbox() {
		
		HomePage hp = new HomePage();	
		hp.navigate_to_Elements().navigate_to_textBox();		
	}
	
	@Test(priority = 1)
	public void verify_Full_Name_Label() {
		tb.verify_FullName_label();
	}
	
	@Test(priority = 2)
	public void verify_Email_Label() {
		tb.verify_Email_label();
	}
	
	@Test(priority = 3)
	public void verify_CurrentAddress_Label() {
		tb.verify_Current_Address_Label();
	}
	
	@Test(priority = 4)
	public void verify_PermanentAddress_Label() {
		tb.verify_Permanent_Address_Label();
	}
	
	@Test(priority = 5)
	public void enter_FullName() {
		tb.enter_FullName();
	}
	
	@Test(priority = 6)
	public void enter_Email() {
		tb.enter_Email();
	}
	
	@Test(priority = 7)
	public void enter_CurrentAddress() {
		tb.enter_CurrentAddress();
	}
	
	@Test(priority = 8)
	public void enter_PermanentAddress() {
		tb.enter_PermanentAddress();
	}
	
	@Test(priority = 9)
	public void click_submit() {
		tb.click_Submit_Btn();
	}
	
	@Test(priority = 10)
	public void verify_Submitted_Full_Name() {
		tb.verify_Submitted_Name();
	}
	
	@Test(priority = 11)
	public void verify_Submitted_Email() {
		tb.verify_Submitted_Email();
	}
	
	@Test(priority = 12)
	public void verify_Submitted_Current_Address() {
		tb.verify_Submitted_CurrentAddress();
	}
	
	@Test(priority = 13)
	public void verify_Submitted_Permanent_Address() {
		tb.verify_Submitted_PermanentAddress();
	}
}
