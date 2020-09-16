package com.automation.testcases;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;
import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;


public class LoginTestCRM extends BaseClass
{
	
	@Test(priority=1)
	public void loginApp()
	{
		logger=report.createTest("Login to CRM");
		
	    LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	   
	    logger.info("Starting application");
	    
	    loginpage.loginToCRM("Selenium_50", "Abcs@123456");
	    
	    logger.pass("Login success");
	    
	    //Helper.captureScreenshot(driver);
	    
	   //------------We Access the excel sheet file-----------
	    
	    //loginpage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));        
	}
}
