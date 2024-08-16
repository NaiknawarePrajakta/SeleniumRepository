package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowCellCount {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile =new FileInputStream("D:\\ExcelTest.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
		
		int lastRowNum = mySheet.getLastRowNum();
		// System.out.println(lastRowNum);
		
		int totalNumberOfRows = lastRowNum;
		
		short lastCellNum = mySheet.getRow(0).getLastCellNum();
		// System.out.println(lastCellNum);
		int totalNumberOfCoulmns = lastCellNum - 1;
		
		for (int i = 0; i <= totalNumberOfRows; i++)
		{
		  for (int j = 0; j <= totalNumberOfCoulmns; j++)
		  {
		     Cell myCell = mySheet.getRow(i).getCell(j);
		      CellType myCellType = myCell.getCellType();
		   
		      if (myCellType == CellType.NUMERIC) 
		      {
		        System.out.print(myCell.getNumericCellValue() + " ");
		      }
		      else if (myCellType == CellType.BOOLEAN) 
		      {
		           System.out.print(myCell.getBooleanCellValue() + " ");
		      }
	           else if (myCellType == CellType.STRING) 
	           {
		            System.out.print(myCell.getStringCellValue() + " ");
		        }
		    }
		   System.out.println();
		}
	}

}
