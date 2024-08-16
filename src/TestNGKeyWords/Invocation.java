package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Invocation {

     @Test(invocationCount = 4)
     public void mytest()
     {
    	Reporter.log("My Test is running", true); 
     }
     
     @AfterMethod
     public void afterMethod()
     {
    	 System.out.println("After Method is running");
     }
	}


