package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readRow {

	public static void main(String[] args) throws EncryptedDocumentException ,IOException{
		
		FileInputStream myFile = new FileInputStream("D:\\ayushi\\Players.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		Row myRow = mySheet.getRow(0);
		Cell myCell = myRow.getCell(0);
		CellType cellType =myCell.getCellType();//-->returns type of cell its is numeric,string or boolean
		System.out.println(cellType);
		String cellValue = myCell.getStringCellValue();
		System.out.println(cellValue);
	}

}
