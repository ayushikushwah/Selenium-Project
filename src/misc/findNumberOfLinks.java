package misc;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class findNumberOfLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);

		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		
		//print how many links are present?
		System.out.println(totalLinks.size());

		// print all links

		for (int i = 0; i <= totalLinks.size() - 1; i++) {
			// to print text of links
			System.out.println(totalLinks.get(i).getText());
			// to print links only
			//getAttribute() prints the value of attributes of web element
			//syantax --> webElement.getAttribute("attribute_name");
			System.out.println("ATTRI :"+totalLinks.get(i).getAttribute("href"));

		}

		// 2nd way

		for (WebElement i : totalLinks) {
			System.out.println(i.getText());
		}

		// 3rd way

		Iterator<WebElement> it = totalLinks.iterator();
		System.out.println("===================Iterator=====================");
		while (it.hasNext()) {
			
			System.out.println(it.next().getText());
		}

		// 4th way

		ListIterator<WebElement> lit = totalLinks.listIterator();
		System.out.println("===================ListIterator=====================");

		while (lit.hasNext()) {
			
			System.out.println(lit.next().getText());
		}

	}
}
