package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("D:\\ExcelTest.xlsx");
		String value =WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();

				System.out.println(value);
		
	}
	
}
