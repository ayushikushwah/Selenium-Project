package setSizeAndsetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		//change position of browser window
		Point point = driver.manage().window().getPosition();
		System.out.println(point);
		Point p = new Point(-500,-60);
		driver.manage().window().setPosition(p);
		System.out.println(p);

	}

}
