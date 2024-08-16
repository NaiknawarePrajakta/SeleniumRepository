package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		WebElement inputField = driver.findElement(By.name("show-hide"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", inputField);
		
		inputField.sendKeys("Good Morning");

		//how sendkeys and click?--> java script executor
		
		//JavascriptExecutor jse = ((JavascriptExecutor)driver);
		//WebElement email = driver. findElement(By.id("email"));
		//jse. executeScript("arguments[0]. value='Business Email*';", email);
		
		//WebElement we = driver.findElement(By.xpath("//*[@id='btn']"));

		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].click();", we);
	}

}
