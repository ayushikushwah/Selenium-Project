package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class RandomeString {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String s1 = RandomString.make(3);
		
		File dest = new File("C:\\Users\\HP\\Pictures\\Draw\\hi"+s1+".png");
		
		FileHandler.copy(src, dest);
		

	}

}
