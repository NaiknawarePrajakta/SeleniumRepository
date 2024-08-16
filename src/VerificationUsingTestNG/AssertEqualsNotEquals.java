package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsNotEquals {
  @Test
  public void f() 
  {
	  String a="Pune";
	  String b="Pune";
	  String c="Mumbai";
	  
	//Assert.assertEquals(a, b,"value of a and b is not matching");
	//Assert.assertNotEquals(a, b,"Value of a and b is matching ");
	Assert.assertNotEquals(a, c,"value of a and c is matching");
	   
  }
}
