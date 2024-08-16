package testNGXML;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio {
	@Test
	public void f() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/?url=https://www.ajio.com%3Fgad_source%3D1&utm_source=google&utm_medium=cpc&utm_campaign=GSB_Brand_August2019&utm_content=&gclid=CjwKCAjw4_K0BhBsEiwAfVVZ__LHcqjmQLduBWEnuHmWDLYM45ulXqRS2XMR8rCgMqNI9WctyasDaxoCNZ8QAvD_BwE");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
			


}
