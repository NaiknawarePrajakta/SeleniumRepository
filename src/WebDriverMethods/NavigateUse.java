package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUse {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		//driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.google.com/");
	}

}
