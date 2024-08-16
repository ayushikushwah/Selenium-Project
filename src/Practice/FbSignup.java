package Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class FbSignup
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ayushi");
	
	}
}
