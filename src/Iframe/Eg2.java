package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		driver.switchTo().frame("courses-iframe");
		String mytext = driver.findElement(By.xpath("//strong[text()=' Learn Earn & Shine']")).getText();
		System.out.println(mytext);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("checkBoxOption1")).click();
	}

}
