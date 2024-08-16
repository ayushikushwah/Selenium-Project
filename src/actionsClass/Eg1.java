package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg1 {

		public static void main(String[] args)
		{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		//Right click(context click) using Actions class
		//1.Find the element and store in ref variable
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));

		//2. Create an object of Actions Class, pass driver object as an argument
		Actions action= new Actions(driver);
		//3. Using Actions class object take nescessary action
		action.moveToElement(rightClickButton).contextClick().build().perform();//right click using actions class

		action.contextClick(rightClickButton).perform();//right click using actions class
		//double click using Actions class
		//1. Find the WebEelment and store in ref variable

		WebElement doubleClickButton =driver.findElement(By.xpath("//button[contains(text(),'Double')]"));

		//2.Create an object of Actions Class, pass driver object as an argument
		//object is already created in last example line num 25
		//3. Using Actions class object take nescessary action
		action.doubleClick(doubleClickButton).perform();
		action.moveToElement(doubleClickButton).doubleClick().build().perform();
		}


}
