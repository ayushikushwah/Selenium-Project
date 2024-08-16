package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedStudy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		
		Thread.sleep(2000);
		
		hideButton.click();//to hide the text box
		
		Thread.sleep(2000);
		
		WebElement hiddenTextBox = driver.findElement(By.id("displayed-text"));
		
		if(hiddenTextBox.isDisplayed())
		{
			hiddenTextBox.sendKeys("Ayushi");
		}
		else {
			showButton.click();//to display the hidden text box
			Thread.sleep(1000);
			hiddenTextBox.sendKeys("Ayushi");
//			System.out.println("Element is hidden , can't send keys!!");
		}
		
		
		
	}

}
