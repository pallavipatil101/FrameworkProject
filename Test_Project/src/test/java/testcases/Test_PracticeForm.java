package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.PracticeForm;
import base.Base;

public class Test_PracticeForm extends Base{
	PracticeForm pf = new PracticeForm();
	
	@Test(priority = 0)
	public void navigate_to_practiceform() {
		HomePage hp = new HomePage();
		hp.navigate_to_forms().navigate_to_practiceform();
	}
	
	@Test(priority = 1)
	public void verify_name_label() {
		pf.verify_name_label();
	}
	
	@Test(priority = 2)
	public void verify_email_label() {
		pf.verify_email_label();
	}
	
	@Test(priority = 3)
	public void verify_gender_label() {
		pf.verify_gender_label();
	}
	
	@Test(priority = 4)
	public void verify_mobile_label() {
		pf.verify_mobile_label();
	}
	
	@Test(priority = 5)
	public void verify_birthdate_label() {
		pf.verify_birthdate_label();
	}
	
	@Test(priority = 6)
	public void verify_subjects_label() {
		pf.verify_subjects_label();
	}
	
	@Test(priority = 7)
	public void verify_hobbies_label() {
		pf.verify_hobbies_label();
	}
	
	@Test(priority = 8)
	public void verify_picture_label() {
		pf.verify_photo_label();
	}
	
	@Test(priority = 9)
	public void verify_address_label() {
		pf.verify_address_label();
	}
	
	@Test(priority = 10)
	public void enter_first_name() {
		pf.enter_first_name();
	}
	
	@Test(priority = 11)
	public void enter_last_name() {
		pf.enter_last_name();
	}
	
	@Test(priority = 12)
	public void enter_email() {
		pf.enter_email();
	}
	
	
	@Test(priority = 13)
	public void select_gender() {
		pf.select_gender();
	}
	
	@Test(priority = 14)
	public void enter_mobile() {
		pf.enter_mobile();
	}
	
	
	@Test(priority = 15)
	public void select_birthdate() {
		pf.select_birthdate();
	}
	
	@Test(priority = 16)
	public void select_hobbies() {
		pf.select_hobbies();
	}
	
	@Test(priority = 17)
	public void upload_picture() {
		pf.upload_photo();
	}
	
	@Test(priority = 18)
	public void enter_address() {
		pf.enter_address();
	}
	
}
