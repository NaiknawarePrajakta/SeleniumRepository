package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).sendKeys("Velocity");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).sendKeys("class");
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_4')]")).click();
		
		Thread.sleep(2000);
		
		String myText=driver.findElement(By.xpath("//div[contains(text(),' new account')]")).getText();
		System.out.println(myText);
	}    

}
