package com.ipledge.qa.FNRPRegistration.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ipledge.qa.base.TestBase;

public class FNRPQuestions extends TestBase{
	
	@FindBy(xpath = "//input[@id='knowledgeAssessment.questions0.answers0.selectedAnswer1']")
	WebElement patcategory1;
	
	@FindBy(xpath = "//button[@id='continueBtn_1']")
	WebElement continubtn1;
	
	@FindBy(xpath = "//input[@id='knowledgeAssessment.questions1.answers0.selectedAnswer1']")
	WebElement patcategory2;
	
	@FindBy(xpath = "//button[@id='continueBtn_2']")
	WebElement continueBtn_2;
	
	@FindBy(xpath = "//input[@id='knowledgeAssessment.questions2.answers0.selectedAnswer1']")
	WebElement patcategory3;
	
	@FindBy(xpath = "//button[@id='continueBtn_3']")
	WebElement continueBtn_3;
	
	
	@FindBy(xpath = "//button[@id='reg_continue_fnrp']")
	WebElement continuefnrpBtn;
	
	

	public FNRPQuestions() throws IOException {
		PageFactory.initElements(driver, this);
	}

	
	public PatientInfo1Page FNRPQuestionDetails() throws IOException {
		
		patcategory1.click();
		continubtn1.click();
		patcategory2.click();
		continueBtn_2.click();
		patcategory3.click();
		continueBtn_3.click();
		continuefnrpBtn.click();
		
		return new PatientInfo1Page();
	}
}
