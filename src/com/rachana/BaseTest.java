package com.rachana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
private  WebDriver driver=null;
	
	 
	
	public BaseTest() {
	// TODO Auto-generated constructor stub
}

	public  WebDriver initializeWebBrowser() throws ExceptionInInitializerError {
		if(driver==null){
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/ExternalResource1/chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		
		
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}

public  void tearDown(){
		
		driver.close();
	}

}
