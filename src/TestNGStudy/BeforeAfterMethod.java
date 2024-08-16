package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
	
	
  @Test
  public void f() 
  {
	  Reporter.log("Test Method is Running", true);
  }
  
   @Test
  public void f2()
  {
	  Reporter.log("Test Method2 is Running", true);
  }
  
   @BeforeMethod
	public void beforeMethod1()
	{
		Reporter.log("Before Method1 is Running", true);
	}
  
   @AfterMethod
    public void afterMethod()
    {
    	Reporter.log("After Method is Running", true);
    }
  
}
