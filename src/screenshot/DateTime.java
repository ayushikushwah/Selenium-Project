package screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DateTime {

	public static void main(String[] args) throws InterruptedException , IOException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		//www.naukri.com/nlogin/login
		
		String date = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\HP\\Pictures\\Draw\\hi"+date+".png");	
		
		FileHandler.copy(src, dest);
		
		

	}

}
