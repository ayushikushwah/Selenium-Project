package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		
		Thread.sleep(2000);
		
		WebElement mobileNumberField = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		
		mobileNumberField.sendKeys("8263801680");
		
//		boolean result = driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
//		System.out.println(result);
		
		WebElement getOtpBUtton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		boolean result = getOtpBUtton.isEnabled();
		System.out.println(result);
		
		getOtpBUtton.click();

	}

}
