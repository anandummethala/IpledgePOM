package com.ipledge.qa.FRPRegistration.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ipledge.qa.base.TestBase;

public class PatientInfo1Page extends TestBase{

	@FindBy(xpath= "//input[@id='patient.firstName']")
	WebElement firstname;
	
	@FindBy(xpath= "//input[@id='patient.lastName']")
	WebElement lastname;
	
	@FindBy(xpath= "//input[@id='patient.residentialAddress.line1']")
	WebElement address;
	
	@FindBy(xpath= "//input[@id='pracLocCity']")
	WebElement City;
	
	@FindBy(xpath= "//input[@id='pracLocZipCode']")
	WebElement zipcode;
	
	@FindBy(xpath= "//button[@id='submitBtn']")
	WebElement continuebtn;
	

			
	
	public PatientInfo1Page() throws IOException {
		PageFactory.initElements(driver, this);
	
	}

	public PatientInfo2Page PatientInfo1Details(String fname, String lname, String addr, String city, String zip) throws InterruptedException, IOException {
		
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		address.sendKeys(addr);
		City.sendKeys(city);
		Select select = new Select(driver.findElement(By.id("pracLocStateCode")));
		select.selectByVisibleText("AZ");
		zipcode.sendKeys(zip);
		Thread.sleep(3000);
		continuebtn.click();
		
		return new PatientInfo2Page();
	}
	
}
