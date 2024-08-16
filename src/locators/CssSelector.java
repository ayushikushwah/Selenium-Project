package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		
		//2.tag and class --> tag.class
		driver.findElement(By.cssSelector("a._9bq5")).click();	
		
		//3.tag and attribute --> 
		WebElement emailOrPhone = driver.findElement(By.cssSelector("div[id=email_container]"));
		
		emailOrPhone.sendKeys("5679796098");
		
	}

}
