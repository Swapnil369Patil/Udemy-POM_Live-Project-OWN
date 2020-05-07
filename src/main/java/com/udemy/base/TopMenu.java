package com.udemy.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.udemy.pages.crm.accounts.AccountsPage;

/*
 *CRM HomePage HASA TopMenu
 * 
 * CEM AccountPage HASA TopMenu
 * 
 * 
*/


public class TopMenu {
	
	
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void gotoHome() {
		
	}
public void gotoFeeds() {
		
	}
public void gotoLeads() {
	
}

//In POM we return object of AccountsPage cause next page is AccountsPage
public AccountsPage gotoAccounts() {
	
	//BasePage.driver.findElement(By.xpath("")).click(); //we can write like this also
	
	//driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
	
	BasePage.click("accountstab_XPATH");
	
	return new AccountsPage();
}
public void gotoContacs() {
	
}
public void signOut() {
	
}

}
