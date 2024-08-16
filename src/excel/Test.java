package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException ,FileNotFoundException{
		//create fileInputStream Object
		FileInputStream fi = new FileInputStream("D:\\ayushi\\Ayushi.xlsx");
//		double data = WorkbookFactory.create(fi).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
//		System.out.println(data);
		
		//IllegalStateException: Cannot get a STRING value from a NUMERIC cell
		//this occirs when you have numeric value and using getstringcellvalue();
		//in this case you can use getColumnIndex() for int;
		//in this case you can use getNumericCellValue() for double;
		
		//filenotfoundException --> file path maybe incorrect
		//EmptyFileException --> file path maybe incorrect
		

		
		//to read boolean value
		boolean a = WorkbookFactory.create(fi).getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
		System.out.println(a);
				
		Object value="ayushi";
		System.out.println(value);
		String a1 = (String)value;
		System.out.println(a1);

	}

}
