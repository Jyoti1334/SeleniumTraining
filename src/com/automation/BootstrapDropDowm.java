package com.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDowm {
	WebDriver driver;
	
		public void intilizeWebEnviroment()
		{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/ExternalResource1/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		
		public void closeSeleniumEasyPopup(){
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement webElement1=	driver.findElement(By.xpath("//a[@id='at-cv-lightbox-close']"));
		if(webElement1.isDisplayed())	{
			webElement1.click();
		}
		else{
			System.out.println("Popup Not Displayed");
		}
		}
		
		public void selectListBoxBootstrapDropdown(){
			
			driver.findElement(By.xpath("//ul/following::a[contains(.,'List Box')][1]/b[@class='caret']")).click();
			WebElement webElement=driver.findElement(By.xpath("//ul/following::a[contains(.,'List Box')][1]/b[@class='caret']"));
			
		     System.out.println("check dropdown optionlist visibility :"+webElement.isDisplayed());
		     
		     if(webElement.isDisplayed()){
		    	 List<WebElement> webElementList=driver.findElements(By.xpath("//ul/following::a[contains(.,'List Box')][1]/b[@class='caret']"));
		         for(WebElement weElement : webElementList){
		        	 String strDropdownOption=weElement.getText();
		        	 System.out.println("Print DropDown Option :"+weElement.getText());
		        	 
		        	 if(strDropdownOption.equals("Data List Filter")){
		        		 weElement.click();
		        		 break;
		        	 }
		        	 
		         }
		     
		     }
		
		
		}
		
		public static void main(String[] args){
			BootstrapDropDowm objBootstrapDropDowm=new BootstrapDropDowm();
			objBootstrapDropDowm.intilizeWebEnviroment();
			objBootstrapDropDowm.closeSeleniumEasyPopup();
			objBootstrapDropDowm.selectListBoxBootstrapDropdown();
			
		}

}
