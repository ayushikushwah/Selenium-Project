package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		
		WebElement nameField = driver.findElement(By.name("firstname"));
		
		Actions act = new Actions(driver);
		act.sendKeys(nameField, "Ayushi").perform();
		//performin one actipn isliye using .perform() if multiple actions then write .build().perform();


	}

}
