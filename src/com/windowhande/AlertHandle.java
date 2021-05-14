package com.windowhande;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertHandle {
	WebDriver driver;
	 Alert alrt;
		public void intilizeWebEnviroment()
		{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/ExternalResource1/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		
		public void toaccept() {
			driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alrt=driver.switchTo().alert();
	    alrt.accept();
		}
		
		public void todismiss() {
			driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alrt=driver.switchTo().alert();
		String text=alrt.getText();
		System.out.println(text);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 alrt.dismiss();
		}
		
		
		public void tosendkeys() {
			driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alrt=driver.switchTo().alert();
		alrt.sendKeys("abcd");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 alrt.accept();
		}
		
		public void tearDown(){
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.close();
		}
		
		
		@BeforeTest
		public void intializeEnvironment(){
			this.intilizeWebEnviroment();
			System.out.println("Before Test Executed");
		}
		
		@Test(priority=1)
		public void TCID_01_VerifyAccept(){
			this.toaccept();
		}
		
		@Test(priority=2)
		public void TCID_02_VerifyDismiss(){
			this.todismiss();
		}
		
		@Test(priority=3)
		public void TCID_03_VerifySendkey(){
			this.tosendkeys();
		
		}
		
		@AfterTest
		public void tearDownEnvironment(){
			this.tearDown();
			System.out.println("After Test Executed");
		}

}
