package com.ninja.qa.TestPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ninja.qa.Base.TestBase;
import com.ninja.qa.Pages.HomePage;


public class HomePageTest extends TestBase{
	
	HomePage hp;
	
	@BeforeMethod
	public void OpenApp()
	{
		openBrowser();
		hp = new HomePage(driver);
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	@Test(priority='1')
	public void testTitle()
	{
		hp.gettitle();
	}
	

	@Test(priority='2')
	public void testRegisterLink()
	{
		hp.clickonMyAccount();  // on homapge click on myaccount
		hp.clickonRegister();  // clcik on register
		hp.gettitle();  // get title
	}

	@Test(priority='3')
	public void testLoginLink()
	{
		hp.clickonMyAccount();  // on homapge click on myaccount
		hp.clickonLogin(); // clcik on login
		hp.gettitle();  // get title
	}
	
	
	@Test(priority='4')
	public void testMacLink() throws InterruptedException
	{
		hp.clickOnMac();
		hp.gettitle();  // get title
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
