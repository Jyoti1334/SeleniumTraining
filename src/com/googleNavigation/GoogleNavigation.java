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
		  List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		   for(WebElement link:allLinks){
			   System.out.println(link.getText() + " - " + link.getAttribute("href"));
		   }
		  // System.out.println(allLinks.size()); 
//		   List<WebElement> allLinks=driver.findElements(By.xpath("//div[@role='navigation']/following::span[@id='xjs']"));
//		   System.out.println(allLinks.size()); 
//		   
//		   for(int i=0;i<allLinks.size();i++){
//			   String strpageNumbers=allLinks.get(i).getText();
//			   if(strpageNumbers.contains("23"))
//			   {
//				   allLinks.get(i).click();
//				   break;
//			   }
//		   }
			 
//		  
//		   List<WebElement> pageNumbers = driver.findElements(By.cssSelector("[valign='top'] > td"));
//	   for(int j = 1 ; j < pageNumbers.size() ; j++) {
////			   String strListIteam=allLinks.get(j).getText(); 
////			   if(allLinks.get(j).getText().equals("23")){
////				   allLinks.get(j).click(); 
////				   break;
////			   }
////			   
////			   
////		   }
//			   
//			   //System.out.println(pageNumbers.size());
//	       if (j > 1) {// we don't need to navigate to the first page
//		       
//    	   driver.findElement(By.cssSelector("[aria-label='Page " + j + "']")).click(); // navigate to page number j
//           continue;
//      }
//		   }
//	         
//
//		       String pagesearch = driver.getCurrentUrl();
//
//       List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));
//       System.out.println(findElements.size());
//	       for(int i=0;i<findElements.size();i++){
//           findElements= driver.findElements(By.xpath("//*[@id='rso']//h3/a"));                
//           findElements.get(i).click();	       }
//                driver.navigate().to(pagesearch);
//          JavascriptExecutor jse = (JavascriptExecutor) driver;
////           //Scroll vertically downward by 250 pixels
//           jse.executeScript("window.scrollBy(0,250)", "");
////		   
//	   }
//	
	   }
	   public void navigate(){
		   objJSE=(JavascriptExecutor)driver;
		   objJSE.executeScript("scroll(0,4000)");
		   List<WebElement> pageNumbers=driver.findElements(By.xpath("//div[@role='navigation']/following::tbody"));
		  // List<WebElement> pageNumbers = driver.findElements(By.cssSelector("[valign='top'] > td"));
		   
		   for(int j = 1 ; j < pageNumbers.size() ; j++) {
			   if(j>1)
			   {
				   driver.navigate().forward();
				 //driver.findElement(By.xpath("//span[text()='Next']")).click();
				// objJSE.executeScript("scroll(0,4000)");
				 
			   }
			   
		   }
	   }
	   
	   
	public static void main(String[] args){
		GoogleNavigation objGoogleNavigation=new GoogleNavigation();
		objGoogleNavigation.intilizeWebEnviroment();
		objGoogleNavigation.toSearch();
		objGoogleNavigation.toNavigatePage();
		//objGoogleNavigation.navigate();
	}

}
