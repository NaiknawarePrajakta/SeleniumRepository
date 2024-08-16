package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DateTime {

	public static void main(String[] args) throws IOException
	{
		String timeStamp= new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		System.out.println(timeStamp);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\Selenium_Screenshot file\\test_"+timeStamp+".png");
		FileHandler.copy(src, dest);
	}

}
