package DropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eg2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver= new ChromeDriver();
		//driver= new EdgeDriver();
		//driver=new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		//1.
		WebElement day = driver.findElement(By.name("birthday_day"));
		//2.
		Select sDay= new Select(day);
		//3.
		sDay.selectByVisibleText("8");
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select sMonth= new Select(month);
		sMonth.selectByIndex(3);
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select sYear= new Select(year);
		sYear.selectByValue("1947");
		//to check if drop down is multi selectable or not
		System.out.println(sYear.isMultiple());
	}

}
