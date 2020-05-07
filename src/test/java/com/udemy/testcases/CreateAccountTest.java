package com.udemy.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.udemy.base.BasePage;
import com.udemy.pages.HomePage;
import com.udemy.pages.LoginPage;
import com.udemy.pages.ZohoAppPage;
import com.udemy.pages.crm.accounts.AccountsPage;
import com.udemy.pages.crm.accounts.CreateAccountPage;
import com.w2a.utilities.Utilities;

public class CreateAccountTest {
	
	
	@Test(dataProviderClass= Utilities.class, dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data) {
		
		
		ZohoAppPage zp= new ZohoAppPage();
		zp.gotoCRM();
		AccountsPage account=BasePage.menu.gotoAccounts();
		CreateAccountPage cap=account.gptoCreateAccounts();
		cap.createAccount(data.get("accountname"));
		
		Assert.fail("Login Test Failed");
	}

}
