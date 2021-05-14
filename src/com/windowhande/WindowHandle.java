package com.windowhande;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowHandle {
	WebDriver driver;
	public Properties objConfig;
	
	public void intilizeWebEnviroment() {
		this.loadConfigProperties();
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/ExternalResource1/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("getUrl from config file : "+objConfig.getProperty("AUT_URL"));
		driver.get(objConfig.getProperty("AUT_URL"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		
	public void windowHandle() {
			String mainWindow=driver.getWindowHandle();
			Set<String> allwindows =driver.getWindowHandles();
		    Iterator<String> iterateWindow= allwindows.iterator();
			
		    while(iterateWindow.hasNext())
		    {
			String childWindow=iterateWindow.next();
			 if(!mainWindow.equals(childWindow))
			 {
			driver.switchTo().window(childWindow);
			
			System.out.println("Window Handled: "+driver.switchTo().window(childWindow).getTitle());
			driver.close();
			}
			}
				driver.switchTo().window(mainWindow);
				System.out.println("Main Window: "+driver.getTitle());
			}
		
	public void tearDown(){
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.close();
	}
	
	public void loadConfigProperties(){
		try{
			objConfig=new Properties();
			objConfig.load(new FileInputStream(System.getProperty("user.dir")+"/src/config/config.properties"));
		}catch(Exception exception){
			System.out.println("I got property file load exception"+exception.getMessage());
			exception.printStackTrace();
		}
	}
     
	@BeforeClass
	public void intializeEnvironment(){
		this.intilizeWebEnviroment();
	}
     
	@Test
	public void TCID_01_VerifyWindowHandle(){
		this.windowHandle();
	}
	
	@AfterClass
	public void tearDownEnvironment(){
		this.tearDown();
	}
}
