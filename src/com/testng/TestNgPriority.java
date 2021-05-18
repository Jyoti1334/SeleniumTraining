package com.testng;

import org.testng.annotations.Test;

public class TestNgPriority {
	
	@Test
	public void TCID_01_e(){
		System.out.println("I'm in method E");	
	}
	@Test
    public void TCID_01_c(){
    	System.out.println("I'm in method C");
	}
	@Test
    public void TCID_01_a(){
    	System.out.println("I'm in method A");
	}
	@Test
    public void TCID_01_d(){
    	System.out.println("I'm in method D");
	}
	@Test
    public void TCID_01_b(){
    	System.out.println("I'm in method B");
	}
	
	@Test
	public void tocheckPriority(){
		System.out.println("====================================================");
	}
	 @Test(priority=6)
	    public void c_method(){
	    System.out.println("I'm in method C");
	    }
	    @Test(priority=9)
	    public void b_method(){
	    System.out.println("I'm in method B");
	    }
	    @Test(priority=2)
	    public void a_method(){
	    System.out.println("I'm in method A");
	    }
	    @Test(priority=1)
	    public void e_method(){
	    System.out.println("I'm in method E");
	    }
	    @Test(priority=3)
	    public void d_method(){
	    System.out.println("I'm in method D");
	    }


}
