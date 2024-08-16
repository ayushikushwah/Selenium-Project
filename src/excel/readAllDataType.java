package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readAllDataType {

	public static void main(String[] args) throws EncryptedDocumentException , IOException{
		FileInputStream fi = new FileInputStream ("D:\\ayushi\\Test.xlsx");
		Sheet mySheet = WorkbookFactory.create(fi).getSheet("Sheet1");
		
		//row --> 0 - 1
		//column --> 0-2
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				Cell myCell = mySheet.getRow(i).getCell(j);
				CellType ct =myCell.getCellType();
//				System.out.print(ct+" ");
				
				if(ct == CellType.NUMERIC)
				{
					double c =myCell.getNumericCellValue();
					System.out.print(c+" ");
				}
				else if(ct == CellType.BOOLEAN)
				{
					Boolean c1 = myCell.getBooleanCellValue();
					System.out.print(c1+" ");
				}
				else  {
					String c2 = myCell.getStringCellValue();
					System.out.print(c2+" ");
				}
			}
			System.out.println();
		}
		

	}

}
