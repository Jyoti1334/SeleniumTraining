package com.googleNavigation;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleNavigation {
	WebDriver driver=null;
	JavascriptExecutor objJSE;
	public void intilizeWebEnviroment(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/ExternalResource1/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	public void toSearch(){
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("India");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@value='Google Search']")).sendKeys(Keys.ENTER);
		
		
		
		//driver.findElement(By.xpath("//div[@jsname='VlcLAe']//center//input[@value='Google Search']")).click();
//      List<WebElement> webList= driver.findElements(By.xpath("//ul[@role='listbox']//li"));
//	 // System.out.println(webList.size());
//	  
//        for(int intList=0;intList<webList.size();intList++){
//       //String strListIteam=webList.get(intList).getText();
//      
//        	if(webList.get(intList).getText().equals("Country in South Asia")){
//	    webList.get(intList).click();
//		  break;
//		  }
//	  }
	
	} 
	   
	   public void toNavigatePage(){
		   objJSE=(JavascriptExecutor)driver;
		   objJSE.executeScript("scroll(0,4000)");
		  // List<WebElement> pageNumbers = driver.findElements(By.cssSelector("[valign='top'] > td"));
		   for(int j = 1 ; j <=23 ; j++) {
	            if (j ==10) {// we don't need to navigate to the first page
	                driver.findElement(By.cssSelector("[aria-label='Page " + j + "']")).click(); // navigate to page number j
	                objJSE.executeScript("scroll(0,4000)");
	                continue;
	              
	            }
	            if(j==14){
               	 driver.findElement(By.cssSelector("[aria-label='Page " + j + "']")).click(); // navigate to page number j
	                objJSE.executeScript("scroll(0,4000)");
	                continue;
               }
	            if(j==18){
	               	 driver.findElement(By.cssSelector("[aria-label='Page " + j + "']")).click(); // navigate to page number j
		                objJSE.executeScript("scroll(0,4000)");
		                continue;
	               }
	            if(j==22){
	               	 driver.findElement(By.cssSelector("[aria-label='Page " + j + "']")).click(); // navigate to page number j
		                objJSE.executeScript("scroll(0,4000)");
		                continue;
	               }
	            if(j==23){
	               	 driver.findElement(By.cssSelector("[aria-label='Page " + j + "']")).click(); // navigate to page number j
		                //objJSE.executeScript("scroll(0,4000)");
		                break;
	               }
		   }}
		   
		   public void toClickSecondLastLink(){
			  // objJSE=(JavascriptExecutor)driver;
			  // objJSE.executeScript("scroll(0,500)");
			   driver.findElement(By.xpath("//div[@id='rso']//following::div[@class='g'][8]")).click();
			   String strTitle=driver.getTitle();
			   System.out.println("Title is :"+strTitle);
		   }
		   


	   
	 
	   
	public static void main(String[] args){
		GoogleNavigation objGoogleNavigation=new GoogleNavigation();
		objGoogleNavigation.intilizeWebEnviroment();
		objGoogleNavigation.toSearch();
		objGoogleNavigation.toNavigatePage();
		objGoogleNavigation.toClickSecondLastLink();
		
	}

}
