package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitiWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discoveryplus.in/home");
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		
		//6000 --> we use 4000 -->remaning 2000 will --> save for next execution
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		

	}

}
