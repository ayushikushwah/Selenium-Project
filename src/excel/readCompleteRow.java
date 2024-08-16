package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readCompleteRow {

	public static void main(String[] args) throws EncryptedDocumentException , IOException{
		FileInputStream myFile = new FileInputStream("D:\\ayushi\\Players.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		//row --> 1 --> fixed
		//column --> 0 to 2
		
		//for rows
		for(int i=0;i<=2;i++)
		{
			String row = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(row +" ");
		}
		
		//for columns
		for(int i=0;i<=3;i++)
		{
			String column =mySheet.getRow(i).getCell(2).getStringCellValue();
			System.out.println(column);
		}

	}

}
