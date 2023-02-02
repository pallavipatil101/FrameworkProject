package actions;

import base.Base;
import excel.utility.ExcelReader;
import locators.TextBox_locators;

public class TextBox extends Base{
	
	TextBox_locators tpl = new TextBox_locators();
	ExcelReader e = new ExcelReader(System.getProperty("user.dir")+"/src/test/resources/Data_DemoQA.xlsx");
	
	public void verify_FullName_label() {
		verify_text("Full Name", tpl.fullName_label());
	}
	
	public void verify_Email_label() {
		verify_text("Email", tpl.email_label());
	}
	
	public void verify_Current_Address_Label() {
		verify_text("Current Address", tpl.currentAddress_label());
	}
	
	public void verify_Permanent_Address_Label() {
		verify_text("Permanent Address", tpl.permanentAddress_label());
	}
	
	public void enter_FirstName(String label, String value) {
		if(label.contains("Name"))
		{
			send(tpl.userName(), value);
		}
	}
	
	public void enter_Email(String label, String value) {
		if(label.contains("Email"))
		{
			send(tpl.userEmail(), value);
		}
	}
	
	public void enter_CurrentAddress(String label, String value) {
		if(label.contains("Current"))
		{
			send(tpl.currentAddress(), value);
		}
	}
	
	public void enter_PermanentAddress(String label, String value) {
		if(label.contains("Permanent"))
		{
			send(tpl.permanentAddress(), value);
		}
	}
	
	
	public void click_Submit_Btn() {
		scroll_to_element(tpl.submitBtn());
		tpl.submitBtn().click();
	}
	
	
	public void verify_Submitted_Name() {
		scroll_to_element(tpl.submittedCurrentAddress());
		verify_text("Name:Pallavi Patil", tpl.submittedName());
	}
	
	public void verify_Submitted_Email() {
		verify_text("Email:pallavi.patil@joshsoftware.com", tpl.submittedEmail());
	}
	
	public void verify_Submitted_CurrentAddress() {
		verify_text("Current Address :Pune", tpl.submittedCurrentAddress());
	}
	
	public void verify_Submitted_PermanentAddress() {
		verify_text("Permananet Address :Miraj", tpl.submittedPermanentAddress());
	}
	
	
	
	public void enter_UserData() {
		send(tpl.userName(), "Pallavi Patil");
		send(tpl.userEmail(), "pallavi.patil@joshsoftware.com");
		send(tpl.currentAddress(), "Pune");
		send(tpl.permanentAddress(), "Miraj");
	}
	
	public void verify_Submitted_Data() {
		scroll_to_element(tpl.submittedCurrentAddress());
		verify_text("Name:Pallavi Patil", tpl.submittedName());
		verify_text("Email:pallavi.patil@joshsoftware.com", tpl.submittedEmail());
		verify_text("Current Address :Pune", tpl.submittedCurrentAddress());
		verify_text("Permananet Address :Miraj", tpl.submittedPermanentAddress());
	}
}
