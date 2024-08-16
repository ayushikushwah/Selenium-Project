package CBT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FbSignUp {
	WebDriver driver;

	@Parameters("browserName")
	@Test
	public void f(String browserName) throws InterruptedException {
		if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("Edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		WebElement firstName = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		firstName.sendKeys("Ayu");
		WebElement lastName = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		lastName.sendKeys("Kushwah");
		WebElement mobileNo = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		mobileNo.sendKeys("9028305678");
		Thread.sleep(2000);
		driver.close();

	}

}
