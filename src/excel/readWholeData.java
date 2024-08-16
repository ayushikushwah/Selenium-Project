package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readWholeData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile = new FileInputStream("D:\\ayushi\\Players.xlsx");
		Sheet sheet = WorkbookFactory.create(myFile).getSheet("Sheet1");

		// row -->0 - 3 and cell --> 0 to 2

		//outer for row
		for (int i = 0; i <= 3; i++) {
			//inner for column or cell
			for (int j = 0; j <= 2; j++) {
				String cell = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(cell+" ");
			}
			System.out.println();
		}

	}

}
