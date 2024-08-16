package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitEg {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discoveryplus.in/home");
		driver.manage().window().maximize();

		FluentWait<WebDriver> ft = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(2000))
				.pollingEvery(Duration.ofMillis(2000))
				.ignoring(NoSuchElementException.class);
		
//		ft.until(ExpectedConditions.elementToBeClickable(By.xpath()));
		
		

	}

}
