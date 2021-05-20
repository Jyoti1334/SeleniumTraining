package com.facebook;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebook.Utilities;

public class TestClass extends BaseTest  {
	public Utilities objUtilities1;
	public Wrapper_Function objWrapperFun;
	public FacebookPageObjects objFacebookPageObjects;
	@BeforeTest
	public void TCID_001_VerifyWebEnvironment(){
		this.initializeWebBrowser();
		objUtilities1=new Utilities();
		objWrapperFun=new Wrapper_Function();
		objFacebookPageObjects=new  FacebookPageObjects();
		System.out.println("Before Test Exceuted");
	}
	
	
@Test
	public void TCID_002_VerifySignUp(){
		
       // objBaseTest.initializeWebBrowser();
        
        objFacebookPageObjects.toCreateNewAccount();
        objWrapperFun.setImplicitwait(10);
		objFacebookPageObjects.setFirstName(objUtilities1.getRandomString(2));
        objFacebookPageObjects.setLastName(objUtilities1.getRandomString(4));
        objFacebookPageObjects.setMobileNumber(objUtilities1.getRandomMobileNumber());
       // objFacebookPageObjects.setEmailId(objUtilities1.getRandomEmailId());
       // objFacebookPageObjects.setRe_EnterEmailId(objUtilities1.getRandomEmailId());
        objFacebookPageObjects.setPassword("Admin@123");
        objFacebookPageObjects.setBirthDate("9");
        objFacebookPageObjects.setBirthMonth("May");
        objFacebookPageObjects.setBirthYear("1995");
        objFacebookPageObjects.setUserGender("male");
        objFacebookPageObjects.clickonSignUp();
        objWrapperFun.setImplicitwait(60);
        //objBaseTest.tearDown();
}
@AfterTest
     public void TCID_003_VerifyTearDown(){
    	this.tearDown();
    	System.out.println("After Test Exceuted");
     }
     

}
	

