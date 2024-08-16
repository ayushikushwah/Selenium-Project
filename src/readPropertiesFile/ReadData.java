package readPropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData {
	
	public static void main(String[] args) throws FileNotFoundException ,IOException {
		
		String filePath = System.getProperty("user.dir")+"\\coverFoxTest.properties";
		//to take input from file ..need to create fileinputstream object
		FileInputStream file = new FileInputStream(filePath);
		
		Properties prop = new Properties();//java.util
		
		prop.load(file);
		
		String Value = prop.getProperty("firstName");
		
		System.out.println(Value);
		
	}
}
