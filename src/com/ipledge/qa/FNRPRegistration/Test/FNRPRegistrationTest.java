package com.ipledge.qa.FNRPRegistration.Test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ipledge.qa.utils.TestUtils;
import com.ipledge.qa.FNRPRegistration.Pages.FNRPQuestions;
import com.ipledge.qa.FNRPRegistration.Pages.CategoryPage;
import com.ipledge.qa.FNRPRegistration.Pages.FinishPage;
import com.ipledge.qa.FNRPRegistration.Pages.HomePage;
import com.ipledge.qa.FNRPRegistration.Pages.LoginPage;
import com.ipledge.qa.FNRPRegistration.Pages.PatientIdentificationPage;
import com.ipledge.qa.FNRPRegistration.Pages.PatientInfo1Page;
import com.ipledge.qa.FNRPRegistration.Pages.PatientInfo2Page;
import com.ipledge.qa.FNRPRegistration.Pages.PatientInfoReviewPage;
import com.ipledge.qa.FNRPRegistration.Pages.PregnancyTestPage;
import com.ipledge.qa.base.TestBase;

public class FNRPRegistrationTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	CategoryPage categorypage;
	PregnancyTestPage pregnancytestpage;
	FNRPQuestions fnrpquestions;
	PatientInfo1Page patientinfo1page;
	PatientInfo2Page patientinfo2page;
	PatientInfoReviewPage patientinforeviewpage;
	PatientIdentificationPage patientidentificationpage;
	FinishPage finishpage;
	
	
	String sheetName = "PatientInfo1details";
	
	public FNRPRegistrationTest() throws IOException {
		
		super();
		}
	
	@BeforeMethod
	
	public void setup() throws IOException {
		
		initialization();
		
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	    categorypage = homepage.clickonRegisterNewPatient();
	    
}


	@DataProvider
	public Object[][] getpatientinfo1Data(){
	Object data[][] = TestUtils.getTestData(sheetName);
		
		return data;
		
		
		
	}
	
	@Test(dataProvider="getpatientinfo1Data")
	
	public void RegistrationFRPTest(String fn, String ln, String add, String cit, String zipcd) throws IOException, InterruptedException {
	pregnancytestpage = categorypage.CategoryDetails();
	fnrpquestions = pregnancytestpage.PregnancyTestDetails();
	patientinfo1page = fnrpquestions.FNRPQuestionDetails();
	patientinfo2page = patientinfo1page.PatientInfo1Details(fn, ln, add, cit, zipcd);
	patientinforeviewpage = patientinfo2page.PageInfo2PageDetails(prop.getProperty("phonenumber"), prop.getProperty("email"), prop.getProperty("dob"));
	patientidentificationpage = patientinforeviewpage.PatientInfoReviewClick();
	finishpage = patientidentificationpage.PatientIdentificationDetails(prop.getProperty("PatientIdentificationNumber"), prop.getProperty("PatientIdentificationNumberConfirm"));
	finishpage.clickFinshbutton();
	
	}
}