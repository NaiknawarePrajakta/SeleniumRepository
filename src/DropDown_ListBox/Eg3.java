package DropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Eg3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		//1.
		WebElement multiSelectDropDown = driver.findElement(By.id("cars"));
		//2.
		Select s= new Select(multiSelectDropDown);
		//3.
		//check if multiple selectable or not?
		System.out.println(s.isMultiple());

		s.selectByIndex(0);
		s.selectByValue("audi");
		s.selectByVisibleText("Opel");

		//s.deselectAll();
		s.deselectByValue("Opel");
		s.deselectByIndex(0);
		s.deselectByVisibleText("Audi");

		//https://www.softwaretestingmaterial.com/sample-webpage-to-automate/
	}

}
