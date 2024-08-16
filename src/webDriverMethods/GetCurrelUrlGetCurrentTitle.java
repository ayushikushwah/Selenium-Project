package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrelUrlGetCurrentTitle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		String title =  driver.getTitle();
		System.out.println("Title :"+title);
		
		String currentUrl =  driver.getCurrentUrl();
		System.out.println("CurrentUrl : "+currentUrl);
	}

}
