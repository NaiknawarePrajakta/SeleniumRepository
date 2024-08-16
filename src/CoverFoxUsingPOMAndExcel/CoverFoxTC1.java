package CoverFoxUsingPOMAndExcel;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethod.Utility;
import CoverFoxPOM.CoverFoxAddressDetailsPage;
import CoverFoxPOM.CoverFoxHealthPlanPage;
import CoverFoxPOM.CoverFoxHomePage;
import CoverFoxPOM.CoverFoxMemberDetailsPage;
import CoverFoxPOM.CoverFoxResultPage;

public class CoverFoxTC1
{
	WebDriver driver;
	CoverFoxHomePage homePage;
	CoverFoxHealthPlanPage healthPlanPage;
	CoverFoxAddressDetailsPage addressDertailsPage;
	CoverFoxMemberDetailsPage memberDetailsPage;
	CoverFoxResultPage resultPage;
	String filePath;
	
	
	
	@BeforeTest
	public void launchBrowser()
	{
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		homePage = new CoverFoxHomePage(driver);
		healthPlanPage = new CoverFoxHealthPlanPage(driver);
		addressDertailsPage = new CoverFoxAddressDetailsPage(driver);
		memberDetailsPage = new CoverFoxMemberDetailsPage(driver);
		resultPage = new CoverFoxResultPage(driver);
		filePath = "D:\\ExcelTest.xlsx";

		}
	
	@BeforeClass
	public void preConditions() throws InterruptedException, EncryptedDocumentException, IOException
	{
		homePage.clickOnGenderButton();
		Thread.sleep(1000);
		healthPlanPage.clickOnNextButton();
		Thread.sleep(1000);
		memberDetailsPage.handleAgeDropDown(Utility.readDataFromExcel(filePath, "Sheet5", 0, 0));
		memberDetailsPage.clickOnNextButton();
		Thread.sleep(1000);
		addressDertailsPage.enterPincode(Utility.readDataFromExcel(filePath, "Sheet5", 0, 1));
		addressDertailsPage.enterMobileNumber(Utility.readDataFromExcel(filePath, "Sheet5", 0, 2));
		addressDertailsPage.clickOnContinueButton();
		
		//addressDertailsPage.enterPincode(Utility.readDataFromExcel(filePath, "Sheet5", 1, 1));
		//addressDertailsPage.enterMobileNumber(Utility.readDataFromExcel(filePath, "Sheet5", 1, 2));
		//addressDertailsPage.clickOnContinueButton();
		
		
	}
	
	//@Test
	//public void validatePinCodeErrorMessage()
	//{
		//String ActualPinErrorMsg = addressDertailsPage.pinErrorMessage();
		
		//String expectedPinErrorMsg = " Please enter a valid pincode ";
		//Assert.assertEquals(ActualPinErrorMsg,expectedPinErrorMsg );
	//}
	
	//@Test
	//public void validateMobileNumErrorMsg()
	//{
		//String actualMobNoErrorMsg = addressDertailsPage.enterMobNumErrorMsg();
		//String expectedMobNoErrorMsg = " Please enter a valid mobile no. ";
		//Assert.assertEquals(actualMobNoErrorMsg, expectedMobNoErrorMsg);
		
	//}
	
	
	
  @Test
  public void validateBanners() throws InterruptedException 
  {
	  Thread.sleep(4000);
	  int bannerPlanNumbers = resultPage.getPlanNumbersFromBanners();
	  int StringPlanNumbers = resultPage.getPlanNumbersFromString();
	  Assert.assertEquals(StringPlanNumbers, bannerPlanNumbers,"Plans on banners not matching with results ,TC failed");
  }
  
  @Test
  public void validatePresenceOfSortButton() throws InterruptedException, IOException
  {
	  Thread.sleep(4000);
	  Assert.assertTrue(resultPage.sortPlanFilterIsDisplayed(), "Sort Plan filter is not displayed,TC is failed");
	  Utility.takeScreenShot(driver, "validatePresenceOfSortButton");
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}
