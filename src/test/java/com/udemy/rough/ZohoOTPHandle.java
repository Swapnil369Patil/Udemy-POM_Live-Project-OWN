package com.udemy.rough;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;



public class ZohoOTPHandle {

	public static final String ACCOUNT_SID = "AC5f759bc9de716be7886233f90836569b";

	public static final String Auth_Token = "629ed9354c755daa20ba8b1fea53b5ee";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\com\\udemy\\executables\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://zoho.com");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Login")).click();

		driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("swapnil369patil@gmail.com");

		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("swap@369");

		driver.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Sign in')]")).click();
		
		//get the otp using Trillio site
		
		Twilio.init(ACCOUNT_SID,Auth_Token);
		
		String smsBody= getMessage();
		System.out.println(smsBody);
		  

	}

	public static String getMessage()
	{
		return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND)==0)
				.filter(m -> m.getTo().equals("+14422693939")).map(Message::getBody).findFirst()
				.orElseThrow(IllegalStateException::new);
	}
	
	private static Stream<Message> getMessages() {
		
		ResourceSet<Message> messages=Message.reader(ACCOUNT_SID).read();
		
		return StreamSupport.stream(messages.spliterator(), false);
	}
}
