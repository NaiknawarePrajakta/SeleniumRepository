package WebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		//total number of rows
		int totalNumberOfRows =

		driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();

		int totalNumberOfColumns =

		driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[1]/th")).size();

		//outer for loop rows
		for(int i=1;i<=totalNumberOfRows;i++)
		{
		//inner for loop for columns
		for(int j=1;j<=totalNumberOfColumns;j++)
		{
		if(i==1)
		{
		String text =

		driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/th["+j+"]")).getText();

		System.out.print(text+" ");
		}
		else {
		String text =

		driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td["+j+"]")).getText();

		System.out.print(text+" ");
		}
		}

		System.out.println();
		}

	}

}
