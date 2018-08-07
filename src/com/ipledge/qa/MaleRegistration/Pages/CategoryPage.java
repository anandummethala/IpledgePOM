package com.ipledge.qa.MaleRegistration.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ipledge.qa.base.TestBase;

public class CategoryPage extends TestBase{

	@FindBy(xpath = "//input[@value='Male']")
	WebElement maleradiobtn;
	
	
	@FindBy(xpath = "//button[@id='submitBtn']")
	WebElement continuebtn;
	
	
	public CategoryPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public PatientInfo1Page CategoryDetails() throws IOException {
		
		maleradiobtn.click();
		continuebtn.click();
		
		return new PatientInfo1Page();
	}

}
