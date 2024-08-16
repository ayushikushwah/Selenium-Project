package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys("iphone 11");
		WebElement searchBtn = driver.findElement(By.xpath("//button[@class='_2iLD__']"));
		searchBtn.click();
		Thread.sleep(2000);
		String text = driver.findElement(By.className("BUOuZu")).getText();
		System.out.println(text);
		
		

	}

}
