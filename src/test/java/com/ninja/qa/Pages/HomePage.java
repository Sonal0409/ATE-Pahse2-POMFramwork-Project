package com.ninja.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ninja.qa.Base.TestBase;

public class HomePage extends TestBase {
	
	Actions a = new Actions(driver);
	// Create PageFactory
	// this code will find the element using xpath locator and store it in webelement object myaccount
	
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement register;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='Desktops']")
	WebElement desktop;
	
	@FindBy(linkText ="Mac (1)")
	WebElement macdropdown;
	
	// create constructor of current class to initaiate the elements
	// every page class will ahve a constructor initiating the elements
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		// driver can now work with your elements and methods of this class
		
	}

	
	// We will now write action methods, that will perform action on these elements
	//but these methods will not be executed here.
	
	public void gettitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	// method name is similar to action to be done
	
	public void clickonMyAccount()
	{
		myaccount.click();
	}
	
	public void clickonLogin()
	{
		login.click();
	}
	
	public void clickonRegister()
	{
	register.click();
	}
	
	public void clickOnMac() throws InterruptedException
	{
	    a.moveToElement(desktop).build().perform();
	    
	    Thread.sleep(1500);
	    
	    macdropdown.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
