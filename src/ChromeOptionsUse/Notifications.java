package ChromeOptionsUse;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifications {

	public static void main(String[] args)throws InterruptedException {
		ChromeOptions obj = new ChromeOptions();
//		obj.addArguments("start-maximized");
//		obj.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(obj);
		driver.get("https://www.justdial.com/");
		Thread.sleep(2000);
		
		//If we want to handle multiple notifications
		ArrayList<String> al = new ArrayList<String>();
		al.add("start-maximized");
		al.add("disable-popup-blocking");
		al.add("incognito");
		
		obj.addArguments(al);//takes string arrayList as arguments
		
//		Alert alt = driver.switchTo().alert();
//		alt.accept();
		

	}

}
