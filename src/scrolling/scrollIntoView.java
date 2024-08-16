package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		WebElement inputField = driver.findElement(By.name("show-hide"));
		WebElement hideBtn = driver.findElement(By.id("opentab"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",inputField);
		
		//how to sendKeys and click --. using javascriptexecutor
		
		 
		Thread.sleep(2000);
		//click on btn using javascript executor
		js.executeScript("arguments[0].click()",hideBtn);
		
		//send keys by using javascript executor
		js.executeScript("arguments[0].value = 'ayushi'",inputField);
		
		

	}

}
