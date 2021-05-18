package com.facebook;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;





public class FacebookPageObjects  {

	Wrapper_Function objWrapperFun=new Wrapper_Function();
	
	     public void toCreateNewAccount(){
		  BaseTest.driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	     }
	


	      //display first name 
	     public void setFirstName(String strFirstName) {
	    BaseTest. driver.findElement(By.xpath("//input[@name='firstname']")).
	     sendKeys(strFirstName);
	    objWrapperFun.setImplicitwait(5);
		   }
       //display surname
       public void setLastName(String strLastName) {
    	   BaseTest.driver.findElement(By.xpath("//input[@name='lastname']")).
       sendKeys(strLastName);
    	   objWrapperFun.setImplicitwait(5);
	   }
      //display Mobile number
       public void setMobileNumber(String strMobileNo) {
    	   BaseTest.driver.findElement(By.xpath("//input[@name='reg_email__']")).
       sendKeys(strMobileNo);
    	   objWrapperFun.setImplicitwait(5);
	   }
       
       public void setEmailId(String strEmailId1){
    	   BaseTest.driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(strEmailId1);
    	   objWrapperFun.setImplicitwait(5);
       }
       public void setRe_EnterEmailId(String strEmailId){
    	   BaseTest.driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(strEmailId);
    	   objWrapperFun.setImplicitwait(5);
       }
       //display password
       public String setPassword(String strPassword) {
    	   BaseTest.driver.findElement(By.xpath("//input[@id='password_step_input']")).
       sendKeys(strPassword);
    	   objWrapperFun.setImplicitwait(5);
	   return strPassword;
      
       }
       
    
        
      public void setBirthDate(String strDate){
  		WebElement dateDropDown= BaseTest.driver.findElement(By.id("day"));
  		//By   dateDropDown= By.id("day");
    	  
  		objWrapperFun.selectValueFromdropdown( dateDropDown,strDate);
  		 objWrapperFun.setImplicitwait(5);
//    	  Select objSelect =new Select(driver.findElement(By.xpath("//select[@id='day']")));
//    	  objSelect.selectByVisibleText(strDate);
    }
       
       public void setBirthMonth(String strMonth){
    		WebElement monthDropDown= BaseTest.driver.findElement(By.id("month"));
      		objWrapperFun.selectValueFromdropdown( monthDropDown,strMonth);
      		 objWrapperFun.setImplicitwait(5);
  	   //objWrapperFun.selectDropDown("//span[@data-name='birthday_wrapper']//select[@id='month']", strMonth); 
 		 
 	   }
      public void setBirthYear(String strYear){
  		WebElement yearDropDown= BaseTest.driver.findElement(By.id("year"));
  		objWrapperFun.selectValueFromdropdown( yearDropDown,strYear);
  		 objWrapperFun.setImplicitwait(5);
    	  // objWrapperFun.selectDropDown("//span[@data-name='birthday_wrapper']//select[@id='year']", strYear); 
  		
  	}
       public void setUserGender(String strGender){
	        
	        if(strGender.equalsIgnoreCase("female")){
	        	BaseTest.driver.findElement(By.xpath("//input[@value='1']")).click();
	          
	        }else if(strGender.equalsIgnoreCase("male")){
	        	BaseTest. driver.findElement(By.xpath("//input[@value='2']")).click();
	        }else{
	        	BaseTest. driver.findElement(By.xpath("//input[@value='-1]")).click();
	            
	    }
	        }
	    
       public void clickonSignUp() {
    	   BaseTest.driver.findElement(By.xpath("//button[@name='websubmit']")).click();
    	   objWrapperFun.setImplicitwait(5);
       }
		
  	
       

}