package com.testng;

import org.testng.annotations.Test;

public class Including_Excluding_Groups {
	
	
	@Test(groups= {"Include Group"})  
	public void TCID_100()   
	{  
	System.out.println("This is test case 1");  
	}
	
	@Test(groups= {"Exclude Group"})  
	public void TCID_101()   
	{  
	System.out.println("This is test case 2");  
	} 
	
	@Test(groups= {"Include Group"})  
	public void TCID_103()   
	{  
	System.out.println("This is test case 3");  
	}  

}
