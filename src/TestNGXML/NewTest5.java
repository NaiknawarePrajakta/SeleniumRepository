package TestNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest5 {
 
	
	@Test(groups= {"regression"})
	public void e() {
		Reporter.log("E is running", true);
	}

    @Test(groups= {"sanity"})                    
	public void f() {
		Reporter.log("F is running", true);
	}

	@Test(groups= {"sanity"})
	public void g() {
		Reporter.log("G is running", true);
	}

	@Test(groups= {"regression"})
	public void h() {
		Reporter.log("H is running", true);
	}


}
