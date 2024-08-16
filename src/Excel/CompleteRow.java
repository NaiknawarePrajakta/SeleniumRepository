package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CompleteRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile =new FileInputStream("D:\\ExcelTest.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		
		for(int i=0;i<=2;i++)
		{
		String value = mySheet.getRow(0).getCell(i).getStringCellValue();
		System.out.print(value+" ");
		}
		System.out.println();
		
		for(int i=0;i<=3;i++)
		{
		String value = mySheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(value);
		}
	}

}
