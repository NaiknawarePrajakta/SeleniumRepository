package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		WebElement showButton = driver.findElement(By.id("show-textbox"));

		// driver.findElement(By.xpath("//a[text()='Free Access to
		//InterviewQues/ResumeAssistance/Material']"))

		// driver.findElement(By.xpath("//a[contains(text(),'Free Access')]"))

		  Thread.sleep(2000);
		//hideButton.click();
		  Thread.sleep(2000);
		WebElement hiddenTextBox = driver.findElement(By.id("displayed-text"));
		if(hiddenTextBox.isDisplayed())
		{
		hiddenTextBox.sendKeys("velocity");
		}
		else {
		showButton.click();
		hiddenTextBox.sendKeys("Pune");
		//System.out.println("Element is not displayed, cant send keys");
		}
		
	}

}
