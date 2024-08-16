package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutTest {
	
  @Test(timeOut = 5000)
  public void a() throws InterruptedException {
	  Thread.sleep(10000);
	  Reporter.log("A Method is running", true);
  }
}
