package com.ninja.qa.TestPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ninja.qa.Base.TestBase;
import com.ninja.qa.Pages.HomePage;
import com.ninja.qa.Pages.RegisterPage;
import com.ninja.qa.Pages.SearchPage;

public class TestSearchPage extends TestBase {
	

	SearchPage sp;
		@BeforeMethod
		public void OpenApp()
		{
			openBrowser();
			sp = new SearchPage(driver);
		}
		
		
		@AfterMethod
		public void CloseApp()
		{
			driver.quit();
		}
		
		@Test
		public void searchProduct() throws InterruptedException
		{
			sp.searchproduct();
			Thread.sleep(1000);
			sp.selectproduct();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	

}
