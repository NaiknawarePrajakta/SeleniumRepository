package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlGetTitle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
		String myTitle= driver.getTitle();
		
		System.out.println(myTitle);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		

	}

}
