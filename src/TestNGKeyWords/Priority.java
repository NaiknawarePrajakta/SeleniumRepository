package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	
	 @Test(priority = -4)
	  public void d() {
		  Reporter.log("d is running", true);
	  }
	 
  
  
	  @Test (priority = 1)                      
  public void b() {
	  Reporter.log("B is running", true);
  }
  
  @Test(priority = -2)
  public void a() {
	  Reporter.log("A is running", true);
  }
  
  @Test(priority = -1)
  public void c() {
	  Reporter.log("C is running", true);
  }
  
 
}
