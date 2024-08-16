package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg6 {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		
		WebElement dropDown = driver.findElement(By.id(""));
		
		Actions act = new Actions(driver);
		
		act.click(dropDown).perform();
//		act.sendK
//		redbus
//		"velocity"-->send in smaller case but shoulbe shown in upper case-->sendkeys-->keys.down

	}

}
