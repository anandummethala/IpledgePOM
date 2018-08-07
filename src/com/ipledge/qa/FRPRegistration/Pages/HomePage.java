package com.ipledge.qa.FRPRegistration.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ipledge.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(linkText = "REGISTER NEW PATIENT")
	WebElement registernewpatient;
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	
	public CategoryPage clickonRegisterNewPatient() throws IOException {
		
		registernewpatient.click();
		
		return new CategoryPage();
	}
	
	
}
