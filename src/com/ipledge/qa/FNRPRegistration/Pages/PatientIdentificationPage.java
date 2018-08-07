package com.ipledge.qa.FNRPRegistration.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ipledge.qa.base.TestBase;

public class PatientIdentificationPage extends TestBase{

	@FindBy(xpath="//input[@id='patient.ipledgeId.value']")
	WebElement patientidentificationnum;
	
	@FindBy(xpath="//input[@id='confirmIpledgeId']")
	WebElement patientidentificationnumconfirm;
	
	@FindBy(xpath="//button[@id='continueBtn']")
	WebElement continuebtn;
	
	public PatientIdentificationPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	
	public FinishPage PatientIdentificationDetails(String patidnum, String patidnumcnfm) throws IOException {
		
		patientidentificationnum.sendKeys(patidnum);
		patientidentificationnumconfirm.sendKeys(patidnumcnfm);
		continuebtn.click();
		
		return new FinishPage();
	}
	
}
