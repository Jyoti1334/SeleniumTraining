package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

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
          expected = "Amazon Sign In";
          actual = driver.getTitle();
          Assert.assertEquals(actual, expected);
          System.out.println(actual);
      }
          @Test(priority = 2)
      public void TCID_101_verifyTodaysDealLink() {
            driver.findElement(By.partialLinkText("Today's Deals")).click() ;
            expected = "Amazon.in - Today's Deals";
            actual = driver.getTitle();
            Assert.assertEquals(actual, expected);
            System.out.println(actual);
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
