package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedListClickExmaple {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);

		driver.findElement(By.name("q")).sendKeys("munjya");

		Thread.sleep(2000);

		List<WebElement> results = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
		System.out.println(results.size());// 10

		// click on element of list where text = "munjya budget"
		for (WebElement r : results) {
			String text = r.getText();
			if (text.equals("munjya budget")) {
				r.click();
				break;
			}
		}

	}

}
