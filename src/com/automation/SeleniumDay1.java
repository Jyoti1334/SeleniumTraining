package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDay1 {
	
	WebDriver driver=null;
	public void intilizeWebEnviroment(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/ExternalResource1/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	public void setUsername(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("Jyoti");
	}
	
	public void setPassword(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("pass")).sendKeys("Admin@123");
	}
	
	public void tearDown(){
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.close();
	}
	
	
	public static void main(String[] args) {
		SeleniumDay1 objSeleniumDay1=new SeleniumDay1();
		objSeleniumDay1.intilizeWebEnviroment();
		objSeleniumDay1.setUsername();
		objSeleniumDay1.setPassword();
		objSeleniumDay1.tearDown();
		
		
	}

}
