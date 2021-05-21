package com.synchronizationWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WrapperFunction {
	//private  WebDriver driver=null;
	
//    public WrapperFunction(WebDriver driver) {
//		
//		this.driver=driver;
//		}
//    
	
	/**
	 * Method to set ImplicitlyWait in  different methods of different classes
	 * @param intSecond
	 */
     public  void setImplicitlyWait(int intSecond){
	
	BaseTest.driver.manage().timeouts().implicitlyWait(intSecond, TimeUnit.SECONDS);
    }
	
	
     
     /**
      * Method to set Explicitly Wait by using presenceOfElementLocated Excepted Condition in different methods of different classes
      * @param locator
      * @return
      */
	public WebElement setExplicitlyWait(By locator){
	    Integer timeoutLimitSeconds = 20;
	    WebDriverWait wait = new WebDriverWait(BaseTest.driver, timeoutLimitSeconds);
	    try {
	        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	    }
	    catch(TimeoutException e){
	        throw new NoSuchElementException(locator.toString());
	    }
	    WebElement element = BaseTest.driver.findElement(locator);
	    return element;
	}
	
	

}
