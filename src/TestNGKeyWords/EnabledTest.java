package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledTest {
    @Test
   public void a() {
    	Reporter.log("A Method is Running",true);
  }
    @Test(enabled = false)
    public void b() {
    	
    	Reporter.log("B Method is Running", true);
   }
    @Test
    public void c() {
    	Reporter.log("c Method is Running", true);
   }
   
   }

