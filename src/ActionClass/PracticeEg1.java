package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeEg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);

		//1.
		WebElement CityField = driver.findElement(By.id("src"));

		//2.
		Actions action= new Actions(driver);

		//3.
		action.sendKeys(CityField, "Nashik").perform();

		for(int i=1;i<=4;i++) 
		{
		Thread.sleep(1000);
		action.sendKeys(Keys.ARROW_DOWN).perform();
		}
		action.sendKeys(Keys.ENTER).perform();
		
		WebElement to =driver.findElement(By.id("dest"));
		action.sendKeys(to, "Mumbai").perform();
		
		for(int i=1;i<=3;i++) 
		{
		Thread.sleep(1000);
		action.sendKeys(Keys.ARROW_DOWN).perform();
		}

		action.sendKeys(Keys.ENTER).perform();
	}

}
