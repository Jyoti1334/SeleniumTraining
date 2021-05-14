package com.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Wrapper_Function {
	private   WebDriver driver=null;
	
	 Select select;
	public Wrapper_Function(WebDriver driver) {
		
		this.driver=driver;
	
	}
	
       public  void wait(int intSecond){
		
		driver.manage().timeouts().implicitlyWait(intSecond, TimeUnit.SECONDS);
	   }
     
//       public void selectDropDown(String strXpath,String strNumber){
//   		select=new Select(driver.findElement(By.xpath(strXpath)));
//   		 select.selectByVisibleText(strNumber);
//   	}
       
       
       
    public void selectDropDown(By locator,String strValue){
 	   try{
  	   WebElement dropdownElement = driver.findElement(locator);
 	   Select dropdown = new Select(dropdownElement);  	  
	   dropdown.selectByVisibleText(strValue);
   	   }catch(NullPointerException ne) {
		   System.out.println(ne);
   	   }
   }
//
//       public static WebElement getWebElement(By locator) {
//   		return driver.findElement(locator);
//   	}
//   	
//   	public void selectValueFromdropdown(By locator,String strValue) {
//   		
//   		try {
//   			Select dropdown = new Select(getWebElement(locator));
//   		dropdown.selectByVisibleText(strValue);
//   	
//   		}catch(Exception e) {
//   			
//   			System.out.println("Webdriver could'nt locate the element");
//   			
//   		}
//   	}

}
