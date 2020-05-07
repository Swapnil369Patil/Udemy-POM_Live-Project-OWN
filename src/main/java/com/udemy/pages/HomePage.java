package com.udemy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.udemy.base.BasePage;

public class HomePage extends BasePage {

	/*WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
	}*/
	
	public void goTOSignUp()
	{
		driver.findElement(By.linkText("Free Sign Up")).click();	
	}
	
	//In POM we return object of Lpginpage cause next page is Login Page
	public LoginPage goTOLogin()
	{
		//driver.findElement(By.linkText("Login")).click();
		//Instaead of write above code we write below cause we already defined our Click method in BasePAge class
		click("loginLink_XPATH");
		
		return new LoginPage();
		}
	public void goTOZohoEdu()
	{
		
	}
	public void goTOSupport()
	{
		driver.findElement(By.xpath("//a[@class='zh-support']")).click();	
	}
	public void goTOLearnMore()
	{
		
	}
	public void validateFooterLinks()
	{
		
	}
}
