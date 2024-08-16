package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyUsingJse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		WebElement velocity = driver.findElement(By.name("firstname"));
		Thread.sleep(1000);
		
		jse.executeScript("arguments[0].scrollIntoView(true)", velocity);
		velocity.sendKeys("Velocity");
	}

}
