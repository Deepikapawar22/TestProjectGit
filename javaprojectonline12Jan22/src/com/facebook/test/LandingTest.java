package com.facebook.test;

import org.testng.annotations.Test;

import com.facebook.pages.LoginPage;
import com.facebookgenericPage.MasterPage;

public class LandingTest {
	@Test
	public void LoginTest() throws Exception {
		
		LoginPage lp = new LoginPage();
		lp.clickEmailOrPhone();
		lp.enterUserName();
		lp.clickPassword();
		lp.enterPassword();
		lp.clickLoginButton();
		lp.enterLoginButton();
	}
	@AfterClass
	public static void closeLoginPage() {
		MasterPage.driver.close();
		
		
		
		
		
	}

}
