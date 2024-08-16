package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class Eg1 {

	    public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		// current focus is on main page
		// but our element is on frame
		// switch focus from main page to frame
		 driver.switchTo().frame("iframe-name");

		// switching focus from main page to Iframe

		WebElement myText = driver.findElement(By.xpath("//strong[text()=' Learn Earn &Shine']"));

		String result = myText.getText();
		System.out.println(result);
		// to take action again on main page, we need to switch selenium focus from
		// frame to main page
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("checkBoxOption2")).click();

	}

}
