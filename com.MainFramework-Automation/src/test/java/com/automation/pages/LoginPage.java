package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage
{
	WebDriver driver;
	
	// This is new commit from kshitija
	public LoginPage(WebDriver ldriver)//Parameterized constructor
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a") WebElement logInBtn;
	
	@FindBy(name="email") WebElement usrName;
	
	@FindBy(name="password") WebElement pwd;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]") WebElement loginBtn;
	
	public void loginToCRM(String username, String password) 
	{
		try 
		{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			
		}
		
		logInBtn.click();
		
		usrName.sendKeys(username);
		
		pwd.sendKeys(password);
		
		loginBtn.click();
	}
}
