package actions;

import base.Base;
import locators.TextBox_locators;

public class TextBox extends Base{
	
	TextBox_locators tpl = new TextBox_locators();
	
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
	
	public void enter_FullName() {
		send(tpl.userName(), "Pallavi Patil");
	}
	
	public void enter_Email() {
		send(tpl.userEmail(), "pallavi.patil@joshsoftware.com");
	}
	
	public void enter_CurrentAddress() {
		send(tpl.currentAddress(), "Pune");
	}
	
	public void enter_PermanentAddress() {
		send(tpl.permanentAddress(), "Miraj");
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
