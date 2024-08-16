package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handleDropDownWithSendKeys {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		//select date without using select class
		
		Actions act = new Actions(driver);
		
		act.click(day).perform();
		Thread.sleep(2000);
		for(int i=1;i<=7;i++)//using for loop as we have to press the same key 7 times
		{
//			act.keyDown(day,Keys.ARROW_UP).perform();
			Thread.sleep(200);
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		
//		act.keyDown(Keys.ENTER).perform();
		act.sendKeys(Keys.ENTER).perform();
		

	}

}
