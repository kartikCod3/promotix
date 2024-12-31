package com.promotix.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.promotix.pageLayer.DashboardScreen;
import com.promotix.pageLayer.LoginPage;
import com.promotix.testBase.TestBase;

public class LoginPageTest extends TestBase {

	
	@Test
	public void verifyLogin() throws Exception 
	{
		
		String expected_output = "Dashboard";
		DashboardScreen homeScreen = new DashboardScreen();
		LoginPage login = new LoginPage();
		login.enterEmail("kartik.mude+03@ksolves.com");
		login.enterPassword("Test@123");
		login.clickOnLoginBtn();
		Thread.sleep(30000);
		
		String actual_output = homeScreen.verifyLogin();
		
		Assert.assertEquals(actual_output, expected_output);
		
		}
	
}
