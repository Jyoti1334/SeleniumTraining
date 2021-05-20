package com.testng;

import org.testng.annotations.Test;

public class TestNG_Groupping {
	
	@Test(groups= {"Group A"})  
	public void testCase_01()   
	{  
	System.out.println("Test case belonging to Group A");  
	}  
	@Test(groups= {"Group A","Group B"})  
	public void testCase_03()   
	{  
	System.out.println("Test case belonging to both Group A and Group B");  
	}  
	@Test(groups= {"Group B"})  
	public void testcase_04()   
	{  
	System.out.println("Test case belonging to Group B");  
	}  

}
