package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathStudy {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");

		Thread.sleep(3000);

		// Xpath -->
		driver.findElement(By.xpath("//input[@id='mobileNumber']"));

		// Id
		WebElement mobileNumberField = driver.findElement(By.id("mobileNumber"));

		// name
		driver.findElement(By.name("mobileNumber"));

	}

}
