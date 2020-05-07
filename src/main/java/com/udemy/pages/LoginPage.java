package com.udemy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.udemy.base.BasePage;

public class LoginPage extends BasePage {

	//Removed this because we have created TestBAse Class
	/*WebDriver driver;

	// constructor
	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}*/

	//In POM we return object of ZohoAppPage cause next page is  ZohoAppPage
	public ZohoAppPage doLogin(String Username, String Password) throws InterruptedException {
					
		/*driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys(Username);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Sign in')]")).click();*/
		
		//Instead of write above code we will write like below cause type(SenKeys) and click mehod is available in BAsePage class
		type("Email_XPATH",Username);
		click("Nextbtn_XPATH");
		type("Password_XPATH",Password);
		click("SignINbtn_XPATH");
		return new ZohoAppPage();
	}

	public void gotoSalesandMarketing() {

	}

	public void gotoFinance() {

	}
}
