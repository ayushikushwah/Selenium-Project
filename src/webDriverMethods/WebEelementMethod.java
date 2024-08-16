package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEelementMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://paytm.com/recharge");
//		
//		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("902675678");
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@type='tel']")).clear();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@id ,'u_0_b')]")).sendKeys("Ayushi");
		
		driver.findElement(By.xpath("//input[contains(@id ,'u_0_b')]")).sendKeys("Kushawah");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@id ,'u_0_b')]")).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_5')]")).click();
		
		String myText = driver.findElement(By.xpath("//div[text()='Create a new account']")).getText();
		System.out.println("myText : "+myText);
	}

}
