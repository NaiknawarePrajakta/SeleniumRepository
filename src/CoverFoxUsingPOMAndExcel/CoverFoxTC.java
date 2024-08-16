package CoverFoxUsingPOMAndExcel;





import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import CommonMethod.Utility;
import CoverFoxPOM.CoverFoxAddressDetailsPage;
import CoverFoxPOM.CoverFoxHealthPlanPage;
import CoverFoxPOM.CoverFoxHomePage;
import CoverFoxPOM.CoverFoxMemberDetailsPage;
import CoverFoxPOM.CoverFoxResultPage;

public class CoverFoxTC {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException  
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		String filePath = "D:\\ExcelTest.xlsx";

		String age = Utility.readDataFromExcel(filePath, "Sheet5", 0, 0);
		String pinCode = Utility.readDataFromExcel(filePath, "Sheet5", 0, 1);
		String mobileNumber = Utility.readDataFromExcel(filePath, "Sheet5", 0, 2);
		// create object of homePage
		CoverFoxHomePage home = new CoverFoxHomePage(driver);
		home.clickOnGenderButton();
		CoverFoxHealthPlanPage healthPlanPage = new

		CoverFoxHealthPlanPage(driver);

		healthPlanPage.clickOnNextButton();
		CoverFoxMemberDetailsPage memberDetailsPage = new CoverFoxMemberDetailsPage(driver);

		memberDetailsPage.handleAgeDropDown(age);
		memberDetailsPage.clickOnNextButton();
		CoverFoxAddressDetailsPage addressDertailsPage = new CoverFoxAddressDetailsPage(driver);

		addressDertailsPage.enterPincode(pinCode);
		addressDertailsPage.enterMobileNumber(mobileNumber);
		addressDertailsPage.clickOnContinueButton();
		Thread.sleep(4000);
		CoverFoxResultPage resultPage = new CoverFoxResultPage(driver);
		resultPage.validateBanners();
		Thread.sleep(4000);
		driver.close();
		
	}

}
