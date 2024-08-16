package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsEg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		Thread.sleep(1000);
		
		WebElement userName= driver.findElement(By.name("user-name"));
		userName.sendKeys("standard_user");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		WebElement logInButton =driver.findElement(By.id("login-button"));
		logInButton.click();
		Thread.sleep(1000);
		
		String myText=driver.findElement(By.xpath("(//div[contains(text(),'Sauce')])[1]")).getText();
		System.out.println(myText);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='1']")).click();
	}

}
