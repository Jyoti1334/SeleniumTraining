package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumActions {
	
	WebDriver driver=null;
	
	public void intializeWebEnvironment(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/ExternalResource1/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	}
	 public void getFacebookSignUpPageTitle() {
			
			String strTitle = driver.getTitle();
			String strExpectedTitle =  "Sign up for Facebook | Facebook";
			if(strTitle.equals(strExpectedTitle)) {
				System.out.println("Title of Facebook SignUp Page is:"+strTitle);
			}else {
				System.out.println("Title not matched");
			}
		}
			
		public void getCurrentPageUrl() {
			
			String strUrl= driver.getCurrentUrl();
			System.out.println("Current URL is:"+strUrl);
		}
		
		public void getTextofCreatenewAccount() {
			
			String strText=driver.findElement(By.xpath("//div[text()='Create a new account']")).getText();
			System.out.println("Text is:"+strText);
		}
		
		public void getFirstnameAttributeValue() {
			
			String strValue=driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("type");
			System.out.println("Value of attribute type is:"+strValue);		
		}
		
		public void getCompletePageSource() {
			
			String strpagesource=driver.getPageSource();
			System.out.println("Complete Page source:"+strpagesource);
		
			}
		
		public void getTagname() {

			String strname=driver.findElement(By.xpath("//input[@name='firstname']")).getTagName();
			System.out.println("Tag name is:"+strname);
	    }
		
		
		public void teardown(){
			driver.close();
			System.out.println("Close driver");
		}
		
		
		
		public static void main(String[] args) {
		
			SeleniumActions objSeleniumActions = new SeleniumActions();
			objSeleniumActions.intializeWebEnvironment();
			objSeleniumActions.getFacebookSignUpPageTitle();
			objSeleniumActions.getCurrentPageUrl();
			objSeleniumActions.getTextofCreatenewAccount();
			objSeleniumActions.getFirstnameAttributeValue();
        // objSeleniumActionEvents.getCompletePageSource();
			objSeleniumActions.getTagname();
			objSeleniumActions.teardown();
			}


}
