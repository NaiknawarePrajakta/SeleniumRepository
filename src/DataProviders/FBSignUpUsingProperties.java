package DataProviders;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBSignUpUsingProperties {
  @Test
  public void f() throws InterruptedException, IOException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  String url = Utility.readDataFromPropertiseFile("url");
	  driver.get(url);
	  driver.findElement(By.name("firstname")).sendKeys(Utility.readDataFromPropertiseFile("firstName"));
	  driver.findElement(By.name("lastname")).sendKeys(Utility.readDataFromPropertiseFile("lastName"));
	  driver.findElement(By.name("reg_email__")).sendKeys(Utility.readDataFromPropertiseFile("mobNum"));
	  Thread.sleep(2000);
	  driver.close();
  }
}
