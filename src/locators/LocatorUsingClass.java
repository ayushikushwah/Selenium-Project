package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorUsingClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(3000);
		
		//className
		WebElement radioButton	= driver.findElement(By.className("radioButton"));
		radioButton.click();
		
		//linked test ---> when text is associated with a link or button
		WebElement openTabButton = driver.findElement(By.linkText("Open Tab"));
//		openTabButton.click();
		
		//partial-link test --> to find element by giving only partial/half text
		driver.findElement(By.partialLinkText("Open")).click();
		
		//css Selectors
		
		//1.tag and Id --> tag#id
		driver.findElement(By.cssSelector("button#openwindow")).click();
		
		
			
		
		
		
		
		
		
		
		

	}

}
