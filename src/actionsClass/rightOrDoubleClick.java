package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class rightOrDoubleClick {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[contains(@class,'context-menu-one btn btn-neutral')]"));
		
		Actions act = new Actions(driver);
		
		//**contextClick() --> rightClick
		
		//1 way --> move cursor to button and then right click
		
		act.moveToElement(rightClickBtn).contextClick().build().perform();
		
		//2 way --> directly right click on button without moving cursor
		
		act.contextClick(rightClickBtn).perform();
		
		//**DoubleClick()
		
		Thread.sleep(1000);
		
		WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		//1 way --> move cursor to btn and then double click
		
		act.moveToElement(doubleClickBtn).doubleClick().build().perform();
		
		//2 way --. directly double click on btn without moving cursor
		
		act.doubleClick(doubleClickBtn).perform();
		
		
		
		
		
		
		

	}

}
