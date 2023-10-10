package com.ninja.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	@FindBy(xpath="//input[@name='search']")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchboxbtn;
	
	
	@FindBy(linkText="iMac")
	WebElement product;
	
   public SearchPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
   
   public void searchproduct()
   {
	   searchbox.sendKeys("mac");
	   searchboxbtn.click();
	 
   }
	
   public void selectproduct()
   {
	   product.click();
   }
	

}
