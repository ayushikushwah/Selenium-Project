package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Ayushi");
		Thread.sleep(200);
		List<WebElement> results = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li"));
		
		//print number of results
		System.out.println(results.size());
		
		//print all results
		Iterator<WebElement> it = results.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		

	}

}
