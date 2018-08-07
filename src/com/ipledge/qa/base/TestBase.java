package com.ipledge.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.xmlbeans.XmlObject;
import org.apache.commons.collections4.ListValuedMap;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;


import com.ipledge.qa.utils.TestUtils;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	




public TestBase() throws IOException {
	
	prop = new Properties();
	
		
		
			FileInputStream	ip = new FileInputStream("C:\\Users\\eicj8za\\eclipse-workspace\\Ipledge\\src\\com\\ipledge\\qa\\config\\config.properties");
		
	
		prop.load(ip);
	
	
	
}

public static void initialization() {
	
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_lib\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
}

	else if(browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	

}

}
	

