package TestNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest3 {
 
	
	@Test
	public void i() {
		Reporter.log("I is running", true);
	}

    @Test                    
	public void j() {
		Reporter.log("J is running", true);
	}

	@Test
	public void K() {
		Reporter.log("K is running", true);
	}

	@Test
	public void l() {
		Reporter.log("L is running", true);
	}


}
