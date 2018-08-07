package com.ipledge.qa.FRPRegistration.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ipledge.qa.base.TestBase;

public class PatientInfo2Page extends TestBase {
	
	@FindBy(xpath="//input[@id='patient.cellPhone.number']")
	WebElement phonenumber;
	
	@FindBy(xpath="//input[@id='patient.email.address']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='patient.birthDate']")
	WebElement dob;
	
	@FindBy(xpath="//input[@id='patient.confirmSSN']")
	WebElement confirmSSN;
	
	@FindBy(xpath="//input[@id='patient_reg_patientconsent']")
	WebElement consent;
	
	@FindBy(xpath="//button[@id='continueBtn']")
	WebElement continuebtn;
	
	

	public PatientInfo2Page() throws IOException {
		PageFactory.initElements(driver, this);
	}

	
	public PatientInfoReviewPage PageInfo2PageDetails(String phn, String ema, String db) throws InterruptedException, IOException {
		
		phonenumber.sendKeys(phn);
		email.sendKeys(ema);
		dob.sendKeys(db);
		confirmSSN.click();
		consent.click();
		continuebtn.click();
		
		return new PatientInfoReviewPage();
	}
	
	
}
