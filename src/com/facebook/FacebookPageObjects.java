package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;




public class FacebookPageObjects  {
private WebDriver driver;
	
	Wrapper_Function objWrapperFun;
	
	 
	public FacebookPageObjects(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public FacebookPageObjects() {
		
		objWrapperFun=new Wrapper_Function(new BaseTest().initializeWebBrowser());
	
	}


	      //display first name 
	     public void setFirstName(String strFirstName) {
	     driver.findElement(By.xpath("//input[@name='firstname']")).
	     sendKeys(strFirstName);
		   }
       //display surname
       public void setLastName(String strLastName) {
       driver.findElement(By.xpath("//input[@name='lastname']")).
       sendKeys(strLastName);
	   }
      //display Mobile number
       public void setMobileNumber(String strMobileNo) {
       driver.findElement(By.xpath("//input[@name='reg_email__']")).
       sendKeys(strMobileNo);
	   }
       
       public void setEmailId(String strEmailId1){
    	   driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(strEmailId1);
       }
       public void setRe_EnterEmailId(String strEmailId){
    	   driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(strEmailId);
       }
       //display password
       public String setPassword(String strPassword) {
       driver.findElement(By.xpath("//input[@id='password_step_input']")).
       sendKeys(strPassword);
	   return strPassword;
       }
       
      public void setBirthDate(String strDate){
  		   By dateDropDown=By.xpath("//select[@id='day']");
    	   objWrapperFun.selectDropDown(dateDropDown,strDate);
//    	  Select objSelect =new Select(driver.findElement(By.xpath("//select[@id='day']")));
//    	  objSelect.selectByVisibleText(strDate);
    }
       
//       public void setBirthMonth(String strMonth){
//   		
//  //  	   objWrapperFun.selectDropDown("//span[@data-name='birthday_wrapper']//select[@id='month']", strMonth); 
//   		 
//   	   }
//       public void setBirthYear(String strYear){
//   		
//    	   objWrapperFun.selectDropDown("//span[@data-name='birthday_wrapper']//select[@id='year']", strYear); 
//   		
//   	}
       public void setUserGender(String strGender){
	        
	        if(strGender.equalsIgnoreCase("female"))
	            driver.findElement(By.xpath("//input[@value='1']")).click();
	          
	        if(strGender.equalsIgnoreCase("male"))
	            driver.findElement(By.xpath("//input[@value='2']")).click();
	        else
	            driver.findElement(By.xpath("//input[@value='-1]")).click();
	            
	    }
	    
       public void clickonSignUp() {
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			}
		
  	
       

}