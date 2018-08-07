package com.ipledge.qa.FNRPRegistration.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ipledge.qa.base.TestBase;

public class PregnancyTestPage extends TestBase{
	
	/*@FindBy(xpath="//input[@id='pregnacyRadioNegative']")
	WebElement negativetestbtn;
	
	@FindBy(xpath="//input[@id='dateofpregtest']")
	WebElement date;*/
	
	@FindBy(xpath="//button[@id='continueBtn']")
	WebElement continuebtn;
	
	
	public PregnancyTestPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	
	public FNRPQuestions PregnancyTestDetails() throws InterruptedException, IOException {
		
		/*negativetestbtn.click();
		
		WebElement date = driver.findElement(By.xpath("//input[@id='dateofpregtest']"));
		Thread.sleep(3000);
		//String dateval = "08/07/2018";
		//selectElementByJS(date, driver, dateval);
		
		date.sendKeys("08/07/2018");
		
		Thread.sleep(3000);*/
		continuebtn.click();
		
		
		return new FNRPQuestions();
	}
	
	/*public static void selectElementByJS(WebElement element, WebDriver driver, String dateval) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value', '"+dateval+"');", element);
	}*/
	
	
}
