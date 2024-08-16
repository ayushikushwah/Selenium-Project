package Practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

class SS
{
	public static void main(String a[]) throws InterruptedException , IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		Thread.sleep(2000);
		
		String s1 = RandomString.make(3);
		
		String date = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File ("C:\\Users\\HP\\Desktop\\Selenium\\Self-Study\\hi.png");
		File dest1 = new File ("C:\\Users\\HP\\Desktop\\Selenium\\Self-Study\\"+date+".png");
		File dest2 = new File ("C:\\Users\\HP\\Desktop\\Selenium\\Self-Study\\"+s1+".png");

		FileHandler.copy(src,dest);
		
		
	}
}
