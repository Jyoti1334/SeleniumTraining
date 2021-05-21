package com.synchronizationWait;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass extends BaseTest{
	
	public AmazonPage objAmazonPage;
	public WrapperFunction objWrapperFunction;
	
	public void initializeObjects(){
		objAmazonPage=new AmazonPage();
		objWrapperFunction=new WrapperFunction();
	}
	
	/**
	 * Method to verify web Environment and use Implicitly Wait to load page
	 */
	@BeforeTest
	public void initializeWebEnvironment(){
		this.initializeWebBrowser();
		this.initializeObjects();
		objWrapperFunction.setImplicitlyWait(10);
	}
	
	
	/**
	 * method to verify amazon page title
	 */
	@Test(priority=1)
	public void verifyAmazonPageTitle(){
		objAmazonPage.getAmazonPageTitle();
		objWrapperFunction.setImplicitlyWait(10);
	}
	
	
	/**
	 * method to verify AmazonPay link
	 */
	@Test(priority=2)
	public void verifyAmazonPayLink(){
		objAmazonPage.getAmazonPayLink();
		objWrapperFunction.setImplicitlyWait(10);
	}
	
	
	/**
	 * method to verify 
	 */
	@AfterTest
	public void verifyTearDown(){
		this.tearDown();
	}
	

}
