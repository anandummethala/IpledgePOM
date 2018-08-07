package com.ipledge.qa.FRPRegistration.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ipledge.qa.base.TestBase;

public class FinishPage extends TestBase{

	@FindBy(xpath="//button[@id='reg_finish']")
	WebElement finishbtn;
	
	@FindBy(xpath="//button[@class='square btn buttonStyle marginTop12']")
	WebElement managepatientsbtn;
	
	@FindBy(xpath="//input[@id='currentPatientSearch']")
	WebElement search;
	
	
	public FinishPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void clickFinshbutton() throws InterruptedException {
		
		finishbtn.click();
		Thread.sleep(3000);
		managepatientsbtn.click();
		Thread.sleep(3000);
		search.sendKeys(prop.getProperty("PatientIdentificationNumber"));
		
	}
	
}
