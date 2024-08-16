package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Nestedframe {

	public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(1000);
		driver.switchTo().frame("frame1");
		String myParentText =

		driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();

		System.out.println(myParentText);
		Thread.sleep(2000);
		//need to switch nested frame

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));

		String myChildtext = driver.findElement(By.xpath("//p[text()='ChildIframe']")).getText();

		System.out.println(myChildtext);

		//finding element from main page
		//need to switch focus from child to main page
		driver.switchTo().defaultContent();
		String mainPageText = driver.findElement(By.xpath("//h1[text()='NestedFrames']")).getText();

		System.out.println(mainPageText);
	}

}
