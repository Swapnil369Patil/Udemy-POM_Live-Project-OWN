package com.udemy.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.udemy.base.BasePage;
import com.udemy.pages.HomePage;
import com.udemy.pages.LoginPage;
import com.udemy.pages.ZohoAppPage;
import com.udemy.pages.crm.CRMHomePage;
import com.udemy.pages.crm.accounts.AccountsPage;
import com.udemy.pages.crm.accounts.CreateAccountPage;

public class LoginTestRough {
	
	public static void main(String[] args) throws InterruptedException {
		
		//we are coment this things because we created base class initialy we used this
		
		/*System.setProperty("webdriver.chrome.driver", 


+"\\src\\test\\resources\\com\\udemy\\executables\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://zoho.com");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
		
		/////here right to left combination is solved it means method will return object of next page and its called chaining 
		HomePage home=new HomePage();
		//initially we call method goTologin();
		//home.goTOLogin();
		//but goTologin page actully responsible for taking us to the login page so it will actully return object of login page 
		LoginPage lp=home.goTOLogin();
		
		//we remove below statements use above loginpage referance
		//LoginPage login=new LoginPage();
		//login.doLogin("swapnil369patil@gmail.com", "swap@369");
		
		// doLogin page actully responsible for taking us to the ZohoAppPage so it will actully return object of ZohoAppPage.
		ZohoAppPage zp= lp.doLogin("swapnil369patil@gmail.com", "swap@369");
		
		//ZohoAppPage zp=new ZohoAppPage();
		zp.gotoCRM();
		
		//below menu is referance variable of TopMenu Class
		//BasePage.menu.signOut();// we can write this type also if we want to sign up 
		
		AccountsPage account=BasePage.menu.gotoAccounts();// 
		
		//Creating account inside CRM so we will click on Add Account button i.e.,"+" symbol.
	//	AccountsPage account=new AccountsPage();
		CreateAccountPage cap=account.gptoCreateAccounts();
		
		//CreateAccountPage cap=new CreateAccountPage();
		cap.createAccount("Swap");
		
				
		
	}

}
