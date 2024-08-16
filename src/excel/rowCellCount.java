package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class rowCellCount {

	public static void main(String[] args) throws EncryptedDocumentException ,IOException{
		//physical count
		//practical count
		
		FileInputStream fi = new FileInputStream("D:\\ayushi\\Test.xlsx");
		Sheet mySheet = WorkbookFactory.create(fi).getSheet("Sheet1");
		
		//get last row number 
		int rowCount = mySheet.getLastRowNum(); // gives--> practical count
		System.out.println(rowCount);
		
		//get last column number
		short colCount = mySheet.getRow(0).getLastCellNum();//gives --> physical count
		System.out.println(colCount);
		int totalCellCount = colCount-1;
		
		for(int i=0;i<=rowCount;i++)
		{
			for(int j=0;j<=totalCellCount;j++)
			{
				Cell cell = mySheet.getRow(i).getCell(j);
				CellType ct = cell.getCellType();
				
				if(ct == CellType.NUMERIC)
				{
					double c1 = cell.getNumericCellValue();
					System.out.print(c1+" ");
				}
				else if(ct == CellType.STRING)
				{
					String c2= cell.getStringCellValue();
					System.out.print(c2+" ");
				}
				else if(ct == CellType.BOOLEAN)
				{
					Boolean c3 = cell.getBooleanCellValue();
					System.out.print(c3+" ");
				}
			}
			System.out.println();
			
		}
	}
}
