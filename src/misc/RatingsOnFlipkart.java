package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RatingsOnFlipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		driver.findElement(By.name("q")).sendKeys("iphone 11");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String text = driver.findElement(By.xpath("(//div[contains(@class,'_5OesEi')])[1]//span[2]//span[1]//span[1]"))
				.getText();
		System.out.println(text);//prints the ratings of particular product by using dynamic xpath
		
		String t = driver.findElement(By.xpath("(//div[contains(@class,'_5OesEi')])[18]//span[2]//span[3]")).getText();
		System.out.println(t);//find review of any product in list using dynamic xpath

	}

}
