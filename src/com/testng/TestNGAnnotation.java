package com.testng;

import org.testng.annotations.*;

public class TestNGAnnotation {
	@BeforeSuite
	public void verifyBeforeSuite(){
		System.out.println("Before Suite Executed");
	}
	@AfterSuite
	public void verifyAfterSuite(){
		System.out.println("After Suite Executed");
	}
	@BeforeTest
	public void verifyBeforeTest(){
		System.out.println("Before Test Executed");
	}
	@AfterTest
	public void verifyAfterTest(){
		System.out.println("After Test Executed");
	}
	@BeforeMethod
	public void verifyBeforeMethod(){
		System.out.println("Before Method Executed");
	}
	@AfterMethod
	public void verifyAfterMethod(){
		System.out.println("After Method Executed");
	}
	@BeforeClass
	public void verifyBeforeClass(){
		System.out.println("Before Class Executed");
	}
	@AfterClass
	public void verifyAfterClass(){
		System.out.println("After Class Executed");
	}

	@Test(priority=1)
	public void TCID_001_verifyFirstTest(){
		System.out.println("First Test Executed");
		System.out.println("========================================");
	}
	@Test(priority=2)
	public void TCID_002_verifySecondTest(){
		System.out.println("Second Test Exceuted");
		System.out.println("========================================");

	}
	@Test(priority=3)
	public void TCID_003_verifyThirdTest(){
		System.out.println("Third Test Exceuted");
		System.out.println("========================================");

	}
	
	
	
	

}
