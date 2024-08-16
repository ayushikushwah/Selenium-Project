package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEg {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discoveryplus.in/home");
		driver.manage().window().maximize();
		
		//create object of webdriverwait class
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		
		//use object to specify condition using ExpectedCOnditions class
		wait.until(ExpectedConditions.
				elementToBeClickable(By.xpath("(//h6[text()='Sign In'])[2]")));
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		

	}
	
	
	

}
