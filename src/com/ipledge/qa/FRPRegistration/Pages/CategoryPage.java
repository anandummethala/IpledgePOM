package com.ipledge.qa.FRPRegistration.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ipledge.qa.base.TestBase;

public class CategoryPage extends TestBase{

	@FindBy(xpath = "//input[@value='FMLREPCLSS']")
	WebElement frpradiobutton;
	
	
	@FindBy(xpath = "//button[@id='submitBtn']")
	WebElement continuebtn;
	
	
	public CategoryPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public PregnancyTestPage CategoryDetails() throws IOException {
		
		frpradiobutton.click();
		continuebtn.click();
		
		return new PregnancyTestPage();
	}

}
