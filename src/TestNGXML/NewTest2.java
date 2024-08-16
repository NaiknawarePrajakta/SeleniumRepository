package TestNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest2 {
 
	
	@Test
	public void e() {
		Reporter.log("E is running", true);
	}

    @Test                    
	public void f() {
		Reporter.log("F is running", true);
	}

	@Test
	public void g() {
		Reporter.log("G is running", true);
	}

	@Test
	public void h() {
		Reporter.log("H is running", true);
	}


}
