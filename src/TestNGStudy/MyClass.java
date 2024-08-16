package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void f() 
  {
	  System.out.println("Good Morning");
	  Reporter.log("This is a Reporter");
	  Reporter.log("This is a Reporter",true);
	  Reporter.log("This is a Reporter",false);
  }
  @Test
  public void f1()
  {
	  System.out.println("Hi");
  }
  @Test
  public void f2()
  {
	  System.out.println("Hello");
  }
  @Test
  public void f3()  //@Test--->1TC--->1Test Method
  {
	  System.out.println("How are you");
  }
  
}
