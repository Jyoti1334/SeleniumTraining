package com.synchronizationWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
static  WebDriver driver=null;
	
	 
	
//	public BaseTest() {
//	
//}


     /**
      * Method to initialize Web Browser
      */
	public  void initializeWebBrowser() {
	//	if(driver==null){
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/ExternalResource1/chromedriver.exe");
		  	  
			driver=new ChromeDriver();
		//}
	
	driver.get("https://www.amazon.in/");
  	   driver.manage().window().maximize();
  		System.out.println("Browser Initialized");
  		//return driver;
   }
	
	
	 
	
	
	/**
	 * Method to terminate Browser
	 */
	 public void tearDown(){
		 driver.close();
	 }

}
