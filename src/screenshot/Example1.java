package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example1 {

	public static void main(String[] args) throws InterruptedException , IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		File myFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println(myFile);
		
//		File dest = new File("C:\\Users\\HP\\Desktop\\Selenium\\Screenshot\\hi.png");
		
		File dest = new File("C:\\Users\\HP\\Desktop\\Selenium\\Screenshot\\hi.png");

		FileHandler.copy(myFile, dest);
		
	}
}
