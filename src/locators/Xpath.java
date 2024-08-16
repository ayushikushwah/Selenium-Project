package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		//xpath by attribute
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ayushi");//FirstName
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kushawah");//LastName
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9027155798");//Email or Mobile
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("ayu@123");//Password
		
		//xpath by text
//		driver.findElement(By.xpath("//div[text()='Create a new account']")).sendKeys("");


	}

}
