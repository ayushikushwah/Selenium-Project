package dataProviders;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FbSignUpUsingProperties {

	@Test
	public void Test() throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility.readDataFromPeroperties("url"));
//		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		WebElement firstName = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		firstName.sendKeys(Utility.readDataFromPeroperties("firstName"));
		WebElement lastName = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		lastName.sendKeys(Utility.readDataFromPeroperties("lastName"));
		WebElement mobileNo = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		mobileNo.sendKeys(Utility.readDataFromPeroperties("mobNo"));
		Thread.sleep(2000);
		driver.close();
	}
}
