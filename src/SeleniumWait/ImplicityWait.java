package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		
		// 6000--> page load 2000, 4000? save-->next execution

		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();

	}

}
//you are waiting for 100sec🡪 page loaded in 20 sec🡪 once page loaded🡪 release timeout(80sec)

