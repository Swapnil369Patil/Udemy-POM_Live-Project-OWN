package com.udemy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.udemy.base.BasePage;
import com.udemy.pages.crm.CRMHomePage;

public class ZohoAppPage extends BasePage {
	
	/*WebDriver driver;
	
	public ZohoAppPage(WebDriver driver) {
		
		this.driver=driver;
		
		
	}*/
	
	//In POM we return object of CRMHomePage cause next page is CRMHomePage
	public CRMHomePage gotoCRM()
	{
		//driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		click("crmlink_XPATH");
		
		return new CRMHomePage();
	}

	public void gotoBooks() {
		
		driver.findElement(By.xpath("//div[contains(text(),'Books')]")).click();
	}
	
	public void gotoDesk() {
		
		driver.findElement(By.xpath("//div[contains(text(),'Desk')]")).click();
	}
}
