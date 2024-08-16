package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterClass {
	
	@BeforeClass 
	public void beforeClass()
	{
		Reporter.log("Before Class is running", true);
	}
  @Test
  public void f()
  {
	  Reporter.log("test Method is running", true);
  }
  
  @Test
  public void f1()
  {
	  Reporter.log("test Method1 is running", true);
  }
  
  @AfterClass
  public void afterClass()
  {
	  Reporter.log("After Class is running", true);
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("before method is running", true); 
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("after method is running", true); 
  }
}
