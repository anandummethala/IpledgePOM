package com.ipledge.qa.FRPRegistration.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ipledge.qa.base.TestBase;

public class PatientInfoReviewPage extends TestBase{
	
	@FindBy(xpath = "//button[@id='continueBtn']")
	WebElement continuebtn;
	
	public PatientInfoReviewPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	
	
	public PatientIdentificationPage PatientInfoReviewClick() throws IOException {
		
		continuebtn.click();
		
		return new PatientIdentificationPage();
	}
	
	
	
	
}
