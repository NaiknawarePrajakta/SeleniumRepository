package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllDataType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile =new FileInputStream("D:\\ExcelTest.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
		
		//outer for loop-->rows
		for(int i=0;i<=1;i++)
		{
			//inner for loop--->columns
			for(int j=0;j<=2;j++)
			{
				Cell myCell = mySheet.getRow(i).getCell(j);
				CellType myCellType = myCell.getCellType();
				
				if(myCellType==CellType.NUMERIC)
				{
					double value = myCell.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(myCellType==CellType.BOOLEAN)
				{
					boolean value = myCell.getBooleanCellValue();
					System.out.print(value+" ");
				}
				else if(myCellType==CellType.STRING)
				{
					String value = myCell.getStringCellValue();
					System.out.print(value+" ");
				}
				
			}
			System.out.println();
			
		}
		
		
	

	}

}
