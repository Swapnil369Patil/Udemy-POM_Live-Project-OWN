package com.udemy.pages.crm.accounts;

import org.openqa.selenium.By;

import com.udemy.base.BasePage;

public class CreateAccountPage extends BasePage {

	
	public void createAccount(String accountName) {
		
		//driver.findElement(By.xpath("accountname_XPATH")).sendKeys(accountName);
		
		type("accountname_XPATH",accountName);
		
		
	}
}
