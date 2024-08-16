package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTypes {

	public static void main(String[] args) {
		
      WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		driver.findElement(By.xpath("//h1[text() = 'Practice Page']"));

		driver.findElement(By.xpath("//legend[contains(text(),'Suggession Class Example')]"));

		driver.findElement(By.xpath("//select[contains(@id,'dropdown-class-example')]"));
		driver.findElement(By.xpath("(//input[@name='radioButton'])[2]"));


	}

}
