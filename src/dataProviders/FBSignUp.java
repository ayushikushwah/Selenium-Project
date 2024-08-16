package dataProviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBSignUp {
	@Test(dataProvider = "Teaching staff", dataProviderClass= dataProviders.DataProviderStudy.class)
	public void Test(String fName ,String lName ,String mobNo) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		WebElement firstName = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		firstName.sendKeys(fName);
		WebElement lastName = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		lastName.sendKeys(lName);
		WebElement mobileNo = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		mobileNo.sendKeys(mobNo);
		Thread.sleep(2000);
		driver.close();
	}
}
