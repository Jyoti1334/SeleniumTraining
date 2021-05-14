package com.rachana;

public class SeleniumAutomationDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		Utilities objUtilities=new Utilities();
		FacebookObject objFacebookObject1=new FacebookObject(new BaseTest().initializeWebBrowser());
		
		 //objBaseTest.initializeWebBrowser();
		 objFacebookObject1.setUserFirstName(objUtilities.generateRandomString(10));
		 objFacebookObject1.setUserLastName(objUtilities.generateRandomString(10));
		 objFacebookObject1.setUserPassword(objUtilities.generateRandomStringWithNumber(10));
		 objFacebookObject1.setUserDateofBirth(objUtilities.generateRandomNumber(31));
		 objFacebookObject1.setUserDateofMonth(objUtilities.generateRandomNumber(12));
		 objFacebookObject1.setUserDateofYear(objUtilities.generateRandomNumber(1950, 2020));
		 objFacebookObject1.setUserGender("female");
		 
	}

}
