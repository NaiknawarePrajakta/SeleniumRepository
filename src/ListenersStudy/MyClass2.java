package ListenersStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersStudy.Listener.class)
public class MyClass2 
{
  
	@Test
  public void e() 
	{
		Reporter.log("e is running", true);
    }
	@Test(dependsOnMethods = {"g"})
	public void f() 
	{
		Reporter.log("f is running", true);
    }
	@Test
	public void g() 
	{
		Assert.fail();
		Reporter.log("g is running", true);
    }
	@Test
	public void h() 
	{
		Reporter.log("h is running", true);
    }
}
