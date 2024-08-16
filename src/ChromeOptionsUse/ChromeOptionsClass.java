package ChromeOptionsUse;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class ChromeOptionsClass {

	public static void main(String[] args) throws IOException{
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("start-maximized");
		obj.addArguments("incognito");
		obj.addArguments("headless");//UI will notbe displayed
		
		WebDriver driver = new ChromeDriver(obj);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Ayushi");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\HP\\Desktop\\Selenium\\Screenshot\\Ayushi.png");
		FileHandler.copy(src, dest);

	}

}
