package com.udemy.pages.crm.accounts;

import org.openqa.selenium.By;

import com.udemy.base.BasePage;

public class AccountsPage extends BasePage{
	
	////In POM we return object of CreateAccountPage cause next page is CreateAccountPage
	
	public CreateAccountPage gptoCreateAccounts() {
		
		 //driver.findElement(By.xpath("createaccountbtn_XPATH")).click(); 
				
		click("createaccountbtn_XPATH");
		
		 return new CreateAccountPage();
		
	}
public void gotoImportAccounts() {
	
}
}
