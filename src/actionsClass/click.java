package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.id("opentab"));
		
		//click()
		//1 way --> move the cursor to button and then click
		
		Actions act = new Actions(driver);
		
		act.moveToElement(btn).click().build().perform();
		
		//2 way ---> directly click without moving cursor
		
		act.click(btn).perform();
		
		

	}

}
