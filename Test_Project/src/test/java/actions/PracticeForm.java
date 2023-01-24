package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.Base;
import excel.utility.ExcelReader;
import locators.PracticeForm_locators;

public class PracticeForm extends Base{
	
	ExcelReader e = new ExcelReader(System.getProperty("user.dir")+"/src/test/resources/Data_DemoQA.xlsx");
	PracticeForm_locators pfl = new PracticeForm_locators();
	public Select select;
	
	public void verify_name_label() {
		verify_text("Name", pfl.name_label() );
	}
	
	public void verify_email_label() {
		verify_text("Email", pfl.email_label() );
	}
	
	public void verify_gender_label() {
		verify_text("Gender", pfl.gender_label() );
	}
	
	public void verify_mobile_label() {
		verify_text("Mobile(10 Digits)", pfl.mobile_label() );
	}
	
	public void verify_birthdate_label() {
		verify_text("Date of Birth", pfl.birthdate_label() );
	}
	
	public void verify_subjects_label() {
		verify_text("Subjects", pfl.subject_label() );
	}
	
	public void verify_hobbies_label() {
		verify_text("Hobbies", pfl.hobbies_label() );
	}
	
	public void verify_photo_label() {
		verify_text("Picture", pfl.photo_label() );
	}
	
	public void verify_address_label() {
		verify_text("Current Address", pfl.address_label() );
	}
	
	public void enter_first_name() {
		send(pfl.firstName(), e.getCellData("Form", "Values", 1));
	}
	
	public void enter_last_name() {
		send(pfl.lastName(), e.getCellData("Form", "Values", 2));
	}
	
	public void enter_email() {
		send(pfl.email(), e.getCellData("Form", "Values", 3));
	}
	
	public void select_gender() {
		for(WebElement g : pfl.genderRadio())
		{
			if(g.getAttribute("value").equals("Female"))
			{
				if(!g.isSelected())
				{
					
					action().moveToElement(g).click().build().perform();
				}
			}
		}
	}
	
	public void enter_mobile() {
		send(pfl.mobile(), e.getData("Form", "Values", 4));
	}
	
	public void select_birthdate() {
		scroll_to_element(pfl.address());
		pfl.calender().click();
		select = new Select(pfl.birthMonthDrop());
		select.selectByVisibleText("March");;
		select = new Select(pfl.birthYearDrop());
		select.selectByVisibleText("1996");
		action().moveToElement(pfl.birthDate()).click().build().perform();
	}
	
	public void select_hobbies() {
		for(WebElement hobby : pfl.hobbiesCheckbox())
		{
			if(hobby.getAttribute("value").equals("2")||hobby.getAttribute("value").equals("3"))
			{
				if(!hobby.isSelected())
				{
					action().moveToElement(hobby).click().build().perform();
					
				}
			}
		}
	}
	
	
	public void enter_address() {
		send(pfl.address(), e.getCellData("Form", "Values", 6));
	}
	
	public void upload_photo() {
		send(pfl.uploadPhoto(), System.getProperty("user.dir")+"/src/test/resources/UploadPhoto.jpeg");
	}
	
	public void select_subjects() {
		scroll_to_element(pfl.subject());
		action().moveToElement(pfl.subject()).click().sendKeys("m").build().perform();
		scroll_to_element(pfl.maths());
		action().moveToElement(pfl.maths()).click().build().perform();
		action().moveToElement(pfl.subject()).click().sendKeys("m").build().perform();
		action().moveToElement(pfl.chemistry()).click().build().perform();
	}
}
