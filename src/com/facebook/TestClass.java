package com.facebook;

import com.rachana.Utilities;

public class TestClass {

	public static void main(String[] args) {
		
		Utilities objUtilities=new Utilities();
       FacebookPageObjects objFacebookPageObjects=new FacebookPageObjects(new BaseTest().initializeWebBrowser());
        objFacebookPageObjects.setFirstName(objUtilities.generateRandomString(5));
        objFacebookPageObjects.setLastName(objUtilities.generateRandomString(2));
        objFacebookPageObjects.setEmailId(objUtilities.generateRandomEmail());
        objFacebookPageObjects.setRe_EnterEmailId(objUtilities.generateRandomEmail());
        objFacebookPageObjects.setPassword("Admin@123");
        objFacebookPageObjects.setBirthDate(Integer.toString(9));
       // objFacebookPageObjects.setBirthMonth("May");
      //  objFacebookPageObjects.setBirthYear("1995");
        objFacebookPageObjects.setUserGender("male");
        objFacebookPageObjects.clickonSignUp();


}
	
}
