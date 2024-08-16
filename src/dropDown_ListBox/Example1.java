package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// 1.Identify list box to be handled and store it in reference variable
		// cssSelector tag with id
		WebElement dropDown = driver.findElement(By.cssSelector("select#dropdown-class-example"));

		Thread.sleep(1000);

		// 2.Create an object of Select class which will accept WebElement as argument
		Select s = new Select(dropDown);

		// 3.By using one of the select class methods we can select values form list box
		// like
		// -->1] selectByVisibleText: selectByVisibleText(String arg0)

		// s.selectByVisibleText("Option2");

		// -->2] selectByIndex: selectByIndex(int arg0)

//		s.selectByIndex(3);
		
		// -->3] selectByValue: selectByValue(String arg0)
		
		s.selectByValue("option2");

	}

}
