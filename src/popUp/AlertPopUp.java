package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("cusid")).sendKeys("Ayushi");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		//switch to alert
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		String altText = alt.getText();
		System.out.println(altText);
		Thread.sleep(2000);
	
		//2nd alert 
		alt.accept();
		
		String s = driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();
		System.out.println(s);
//		
		

	}

}
