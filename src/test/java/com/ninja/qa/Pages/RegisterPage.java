package com.ninja.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastname;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement emailid;
	@FindBy(xpath="//input[@name='telephone']")
	WebElement phone;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement passwd;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement confirmpasswd;
	@FindBy(xpath="(//input[@name='newsletter'])[1]")
	WebElement subscriberadiobtn;
	@FindBy(xpath="//input[@name='agree']")
	WebElement policycheckbox;
	@FindBy(xpath="//input[@type='submit']")
	WebElement continuebutton;
	
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void regirsteruser(String name,String lname,String email,String ph,String password,String cpasswd) throws InterruptedException {
		
		firstname.clear();
		firstname.sendKeys(name);
		lastname.clear();
		lastname.sendKeys(lname);
		emailid.clear();
		emailid.sendKeys(email);
		phone.clear();
		phone.sendKeys(ph);
		passwd.clear();
		passwd.sendKeys(password);
		confirmpasswd.clear();
		confirmpasswd.sendKeys(cpasswd);
		subscriberadiobtn.click();
		Thread.sleep(1000);
		policycheckbox.click();
		Thread.sleep(1000);
		continuebutton.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
