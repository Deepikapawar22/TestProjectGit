package com.facebook.pages;

import com.facebookgenericPage.MasterPage;

public class LoginPage extends MasterPage {

	public LoginPage() throws Exception {
		super();
	}

	//click email or phone
	public void clickEmailOrPhone() {
		click("EmailOrPhone");
	}

	// Enter Username
	public void enterUserName() {
		enterData("EmailOrPhone", "testData1");
		
		//Click password
		public void clickPassword() {
			click("Password");
		}
	}

	private void enterData(String xpathKey, String testData) {
		// TODO Auto-generated method stub
		
	}

	// Enter PAssword
	public void enterPassword() {
		enterData("Password", "testData2");

	}
	//Click Login Button
	public void clickLoginButton() {
		click("LoginButton");
	}

}
