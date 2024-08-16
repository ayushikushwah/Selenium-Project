package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3 {

	public static void main(String[] args) throws InterruptedException {

		// Multiple ways to create object of chrome driver
		
		//1.
		//ChromeDriver driver = new ChromeDriver();	
		
		//2.
//		WebDriver driver = new ChromeDriver();

		//3.up-casting
		WebDriver driver;
		driver = new ChromeDriver();
//		driver = new FirefoxDriver();
//		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement carMultiSelectDropDown = driver.findElement(By.name("cars"));
		
		Select s = new Select(carMultiSelectDropDown);
		System.out.println(s.isMultiple());
		
		s.selectByIndex(1);
		s.selectByVisibleText("Opel");
		s.selectByValue("audi");
		Thread.sleep(2000);
		
		s.deselectByIndex(3);
		s.deselectByValue("saab");
		s.deselectByVisibleText("Opel");
		

	}
}
