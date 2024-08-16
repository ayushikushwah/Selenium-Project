package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args)throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame1");
		String text = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(text);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		
		String nestedText = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(nestedText);
		
		driver.switchTo().defaultContent();
	}

}
