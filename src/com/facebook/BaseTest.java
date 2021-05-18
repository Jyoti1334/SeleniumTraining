package com.facebook;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest{
  static  WebDriver driver=null;
	
	 
	
	

	 public  void initializeWebBrowser() {
			
	   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/ExternalResource1/chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
			
	    }

      public  void tearDown(){
		
		driver.close();
	  }

}





