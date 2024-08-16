package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyDownAndkeyUp {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		
		Actions act= new Actions(driver);
		//pass first name in small case but it shoulbe entered first name value in capital
		
		act.keyDown(firstName , Keys.SHIFT).sendKeys("ayushi").keyUp(Keys.SHIFT).build().perform();
		

	}

}
