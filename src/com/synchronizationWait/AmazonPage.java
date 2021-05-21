package com.synchronizationWait;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AmazonPage {
	//private  WebDriver driver=null;
	WrapperFunction objWrapperFunction=new WrapperFunction();
	
//	public AmazonPage(WebDriver driver){
//		this.driver=driver;
//		
//	}
	
	/**
	 * Method to get Amazon Title
	 */
	public void getAmazonPageTitle(){
		 String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
         String actualTitle =BaseTest. driver.getTitle();
         Assert.assertEquals(actualTitle, expectedTitle);
         System.out.println(actualTitle);
		
	}
	
	
	/**
	 * Method to get AmazonPay link by using Explicitly wait 
	 */
	public void getAmazonPayLink(){
		WebElement amazonPayLink;
		amazonPayLink=objWrapperFunction.setExplicitlyWait(By.partialLinkText("Amazon Pay"));
		amazonPayLink.click();
	}
	
	

}
