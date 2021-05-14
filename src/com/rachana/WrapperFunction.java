package com.rachana;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WrapperFunction {
	private  WebDriver driver=null;
	
	 Select select;
	public WrapperFunction(WebDriver driver) {
		
		this.driver=driver;
		
		
	}

	public  void waitMethod(int intSecond){
		
		
		driver.manage().timeouts().implicitlyWait(intSecond, TimeUnit.SECONDS);
	}
	
	public void SelectObjectCreate(String strXpath,String strNumber){
		select=new Select(driver.findElement(By.xpath(strXpath)));
		 select.selectByValue(strNumber);
	}

	

}
