package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class XpathStudy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(2000);
		// xpath-->
		driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		// id-->
		WebElement mobileNumberField = driver.findElement(By.id("mobileNumber"));
		// name-->
		driver.findElement(By.name("mobileNumber"));
	}

}
