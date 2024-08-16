package ChromeOption;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotiFications {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option= new ChromeOptions();
		//option.addArguments("disable-notifications");
		//If we want to pass multiple arguments--> create an object of List
		ArrayList<String>al= new ArrayList<String>();
		al.add("disable-notifications");
		al.add("start-maximized");
	//	al.add("incognito");
	
		
		option.addArguments(al);
		WebDriver driver = new ChromeDriver(option);
	
		driver.get("https://www.justdial.com/");
		Thread.sleep(1000);
		

	}

}
