package com.udemy.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.udemy.pages.HomePage;
import com.udemy.pages.LoginPage;
import com.udemy.pages.ZohoAppPage;
import com.w2a.utilities.Utilities;

public class LoginTest extends BaseTest {

	@Test(dataProviderClass = Utilities.class,dataProvider="dp")
	public void loginTest(Hashtable<String,String> data) throws InterruptedException {
		
		HomePage home=new HomePage();
		LoginPage lp=home.goTOLogin();
		ZohoAppPage zp= lp.doLogin(data.get("username"), data.get("password"));
		
		Assert.fail("Login Test Failed");
		
		
	}
}
