package dataProviders;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Utility {
	
	
	@DataProvider(name="coverFox") 
	public String[][] myData() throws IOException
	{
		String ar[][] = readExceldata("CoverFox","Sheet3");
		return ar;
	}
	
	public String[][]readExceldata(String filePath , String sheetName) throws IOException
	{
		String path = System.getProperty("user.dir")+"\\"+filePath+".xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet mySheet = WorkbookFactory.create(file).getSheet(sheetName);
		
		int rowCount = mySheet.getLastRowNum();
		int cellCount = mySheet.getRow(0).getLastCellNum()-1;
		
		String data[][] = new String[rowCount+1][cellCount+1];		
	
		
		//for rows
		for(int i =0;i<=rowCount;i++)
		{
			for(int j=0;j<=cellCount;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				data[i][j]=value;
				
			}
		}
		
		return data;
	}
	
	public static String readDataFromPeroperties(String key) throws IOException
	{
		String filePath = System.getProperty("user.dir")+"\\coverFoxTest.properties";
		FileInputStream file = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(file);
		String value = prop.getProperty(key);
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
