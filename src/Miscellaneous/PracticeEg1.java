package Miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeEg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Tcs");
		Thread.sleep(100);
		List<WebElement> resluts =driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println(resluts.size());//10
		
		//for each
				for(WebElement r:resluts)
				{
				System.out.println(r.getText());
				}
	}

}
