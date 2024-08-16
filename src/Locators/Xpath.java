package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Prajakta");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("prajakta@123gmail.com");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dhokale");
		
	    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("praju");
	
	}
}
