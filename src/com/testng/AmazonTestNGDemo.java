package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class AmazonTestNGDemo {
	 public WebDriver driver=null; 
    public String expected = null;
    public String actual = null;
        @BeforeTest
      public void initializeBrowser() {
        	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/ExternalResource1/chromedriver.exe");
     	   driver=new ChromeDriver();
     	   driver.get("https://www.amazon.in/");
     	   driver.manage().window().maximize();
     		System.out.println("Browser Initialized");	
      }
      
      @BeforeMethod
      public void verifyHomepageTitle() {
          String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
          System.out.println(actualTitle);
      }
          @Test(priority = 1)
      public void TCID_100_verifySiginLink(){
          driver.findElement(By.xpath("//span[text()='Account & Lists']")).click() ;
          String verifyAssertNull=null;
          expected = "Amazon Sign In";
          actual = driver.getTitle();
          Boolean verifyTitleIsPresent=driver.getTitle().equalsIgnoreCase("Amazon Sign In");
          Boolean verifyTitleIsChanged=driver.getTitle().equalsIgnoreCase("Amazon login");
          Assert.assertEquals(actual, expected);
          System.out.println(actual);
          Assert.assertNotEquals(expected, "Amazon");
          Assert.assertTrue(verifyTitleIsPresent);
          Assert.assertFalse(verifyTitleIsChanged);
          Assert.assertNotNull(verifyTitleIsPresent);
          Assert.assertNull(verifyAssertNull); 
      }
          @Test(priority = 2)
      public void TCID_101_verifyTodaysDealLink() {
        	  SoftAssert softAssert = new SoftAssert();
            driver.findElement(By.partialLinkText("Today's Deals")).click() ;
            
            //expected = "Amazon.in - Today's Deals";
            actual = driver.getTitle();
//            Assert.assertEquals(actual, expected);
//            
            Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Amazon.in - Today's Deals");
            softAssert.assertEquals(actual, "Amazon.in - Today's Deals");
            System.out.println(actual);
            softAssert.assertNotEquals(actual, "Amazon.in - Today's Deals");
            softAssert.assertNull(verifyTitle);
            softAssert.assertNotNull(verifyTitle);
            softAssert.assertTrue("Amazon.in".equals("amazon.In"), "First soft assert failed");
            softAssert.assertFalse("Amazon.in".equals("Amazon.in"), "Second soft assert failed");
            softAssert.assertAll();
      }
      @AfterMethod
      public void goBackToHomepage ( ) {
            driver.navigate().back();
            System.out.println("Back to Home Page");
      }
       
      @AfterTest
      public void terminateBrowser(){
          driver.close();
          System.out.println("Browser  is Closed");
      }

}
