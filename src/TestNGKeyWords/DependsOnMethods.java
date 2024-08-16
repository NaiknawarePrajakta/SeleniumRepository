package TestNGKeyWords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
  @Test(dependsOnMethods = {"b"})
  public void a() {
	  
	  Reporter.log("A Method is running", true);
  }
  
 
  @Test
  public void b() {
	  
	  Reporter.log("b Method is running", true);
  }
  
  @Test
  public void c() {
	  
	  Reporter.log("c Method is running", true);
  }
}
