package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleKeywords {
  @Test
  public void a() {
	  Reporter.log("A Method is Running", true);
  }
  
  @Test(invocationCount = 2, priority = -3)
  public void b() {
	  Reporter.log("b Method is Running", true);
  }
  
  @Test(enabled = false, invocationCount = 3)
  public void c() {
	  Reporter.log("c Method is Running", true);
  }
  
}
