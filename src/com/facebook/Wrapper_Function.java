package com.facebook;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Wrapper_Function  {
	

	
	 Select select;
	
	
       public  void setImplicitwait(int intSecond){
		
    	   BaseTest.driver.manage().timeouts().implicitlyWait(intSecond, TimeUnit.SECONDS);
	   }
     
//       public void selectDropDown(String strXpath,String strNumber){
//   		select=new Select(driver.findElement(By.xpath(strXpath)));
//   		 select.selectByVisibleText(strNumber);
//   	}
//       public static selectValueFromdropdown(WebElement element, String value) {
//    	  try{
//    	   Select s = new Select(element);
//    	   s.selectByVisibleText(value);
//    	  }catch(Exception e)
//    	  {
//    		  System.out.println(e);
//    	  }
//       }
       
       
//    public void selectDropDown(By locator,String strValue){
// 	   try{
//  	   WebElement dropdownElement = driver.findElement(locator);
// 	   Select dropdown = new Select(dropdownElement);  	  
//	   dropdown.selectByVisibleText(strValue);
//   	   }catch(Exception e) {
//		   System.out.println(e);
//   	   }
//   }
       
//
       
       public void selectValueFromdropdown(WebElement element, String value) {
      	  try{
      	   Select s = new Select(element);
      	   s.selectByVisibleText(value);
      	  }catch(Exception e)
      	  {
      		  System.out.println(e);
      	  }
         }
//   public static WebElement getWebElement(By locator) {
//  		return BaseTest.driver.findElement(locator);
//  	}
//  	 	public void selectValueFromdropdown(By locator,String strValue) {
// 		 		  			Select dropdown = new Select(getWebElement(locator));
// 		
//  		     dropdown.selectByVisibleText(strValue);
// 	  		
// 	}

}
