package CommonMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	     // excelData
		// screenSHot
		// click
		// scroll
		// wait-->implicit
	
	public static void scrollIntoView(WebDriver driver, WebElement element) 
	    {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		}
	
	public static void takeScreenShot(WebDriver driver, String fileName) throws
	IOException {

	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("D:\\Selenium_Screenshot file\\"+fileName+".png");
	FileHandler.copy(src, dest);
	}
		
	public static String readDataFromExcel(String filePath, String sheetName, int rowNum, int cellNum)

			throws EncryptedDocumentException, IOException 
	       {
			FileInputStream myFile = new FileInputStream(filePath);
String value =WorkbookFactory.create(myFile).getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
              return value;
			}
	 
	public static void clickOnElement(WebDriver driver, WebElement element) 
	   {
		scrollIntoView(driver, element);
		}
	
	public static String readDataFromPropertiseFile(String key) throws IOException
	{
		
		FileInputStream myFile =new FileInputStream(System.getProperty("user.dir")+"//fbTest.properties");
		Properties prop =new Properties();
		prop.load(myFile);
		String value = prop.getProperty(key);
		return value;
	}

	
		

	}


