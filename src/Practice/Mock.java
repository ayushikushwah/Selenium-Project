package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
		Thread.sleep(3000);

		WebElement visibleAfterBtn = driver.findElement(By.id("visibleAfter"));

		if (visibleAfterBtn.isDisplayed()) {
			System.out.println("VisibleAfter Button is dispalyed");
		} else {
			System.out.println("VisibleAfter Button is not dispalyed");
		}

	}

}
