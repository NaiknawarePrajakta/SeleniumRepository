package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("D:\\ExcelTest.xlsx");
		//double value = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(1).getCell(2).getNumericCellValue();
		//System.out.println(value);
		
		//String value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		//System.out.println(value1);
		
		boolean value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
        System.out.println(value2);
	}

}
