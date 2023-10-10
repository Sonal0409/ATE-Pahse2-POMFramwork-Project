package com.ninja.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	@FindBy(xpath="//input[@id='input-quantity']")
	WebElement quantity;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement addtoCart;
	
	
public ProductPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

public void addtocart() throws InterruptedException
{
	quantity.clear();
	quantity.sendKeys("5");
	Thread.sleep(1000);
	addtoCart.click();
}

}
