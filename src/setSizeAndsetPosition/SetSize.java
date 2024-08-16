package setSizeAndsetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		//change the size of the browser window
		Dimension d = driver.manage().window().getSize();
		System.out.println(d);
		
		Dimension dimension = new Dimension(500,800);		
		driver.manage().window().setSize(dimension);
		System.out.println(dimension);
	}

}
