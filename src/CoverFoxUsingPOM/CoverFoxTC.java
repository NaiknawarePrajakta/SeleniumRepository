package CoverFoxUsingPOM;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CoverFoxTC {

	public static void main(String[] args) 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		// create object of homePage
		CoverFoxHomePage home = new CoverFoxHomePage(driver);
		home.clickOnGenderButton();
		CoverFoxHeathPlanPage healthPlanPage = new CoverFoxHeathPlanPage(driver);
		healthPlanPage.clickOnNextButton();

		CoverFoxMemberDetailsPage memberDetailsPage = new CoverFoxMemberDetailsPage(driver);

		memberDetailsPage.handleAgeDropDown();
		memberDetailsPage.clickOnNextButton();
	

	}

}
