package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		//current focus is on main page
		///our element is present on iframe
		//switch focus from main page to iframe
		
		driver.switchTo().frame("iframe-name");//switching focus from main page to iframe
		
		WebElement text = driver.findElement(By.xpath("//strong[text()=' Learn Earn & Shine']"));
		
		System.out.println(text.getText());
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("opentab")).click();

	}

}
