package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(3000);

		// switch to Parent Frame
		driver.switchTo().frame("frame1");
		String parentFrameText = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(parentFrameText);

		Thread.sleep(1000);

		// switch to Child Frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));

		String childFrameText = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(childFrameText);

	}
}
