package CoverFoxTest;


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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CoverFoxBase.Base;
import CoverFoxPOM.CoverFoxAddressDetailsPage;
import CoverFoxPOM.CoverFoxHealthPlanPage;
import CoverFoxPOM.CoverFoxHomePage;
import CoverFoxPOM.CoverFoxMemberDetailsPage;
import CoverFoxPOM.CoverFoxResultPage;
import CoverFoxUtility.Utility;

@Listeners(CoverFoxUtility.Listeners.class)
public class CoverFoxTC2 extends Base
{
	
	CoverFoxHomePage homePage;
	CoverFoxHealthPlanPage healthPlanPage;
	CoverFoxAddressDetailsPage addressDertailsPage;
	CoverFoxMemberDetailsPage memberDetailsPage;
	CoverFoxResultPage resultPage;
	String filePath;
	
	
	
	@BeforeTest
	public void launchBrowser()
	{
		openBrowser();
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
	}
		
		
		
	
	
	
	
  @Test
  public void validateBanners() throws InterruptedException 
  {
	  Thread.sleep(4000);
	  Assert.fail();
	  int bannerPlanNumbers = resultPage.getPlanNumbersFromBanners();
	  int StringPlanNumbers = resultPage.getPlanNumbersFromString();
	  Assert.assertEquals(StringPlanNumbers, bannerPlanNumbers,"Plans on banners not matching with results ,TC failed");
  }
  
  @Test
  public void validatePresenceOfSortButton() throws InterruptedException, IOException
  {
	  Thread.sleep(4000);
	  Assert.fail();
	  Assert.assertTrue(resultPage.sortPlanFilterIsDisplayed(), "Sort Plan filter is not displayed,TC is failed");
	 
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
	  browserClose();
  }
}
