package popUp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/auth");
		driver.manage().window().maximize();
		
		String s1 = driver.findElement(By.xpath("//h1[text()='Ready to take the next step?']")).getText();
		System.out.println(s1);
		
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		
		String mainPageWindowId = driver.getWindowHandle();
		Set<String> allWindowIds =  driver.getWindowHandles();
		System.out.println(mainPageWindowId);
		System.out.println(allWindowIds);
		
		//we also iterate throgh set or use arraylist to get elements
//		Iterator<String> it = allWindowIds.iterator();
//		it.next();
//		it.next();
		
		//change set --> arraylist
		ArrayList<String> arrObj = new ArrayList<String>(allWindowIds);
		
		 String mainPageId = arrObj.get(0);//getting main page id from arraylist
		 String childPageId = arrObj.get(1);//getting child page id from arraylist
		 
		 //switching focus to child page
		 driver.switchTo().window(childPageId);
		 driver.manage().window().maximize();
	
		//sending email id to child page /browser
		driver.findElement(By.id("identifierId")).sendKeys("ayu12@gmail.com");
		
		Thread.sleep(2000);
		
		//closing the child window
		driver.close();
		
		//after closing child page -->if perform action on child page
		//gives exception --> NoSuchWindowException
		
//		System.out.println(driver.findElement(By.xpath("[text()='Sign in']")).getText());
		
//		driver.switchTo().window(mainPageId);
		
		System.out.println
		(driver.findElement(By.xpath("//span[text()='Create an account or sign in.']")).getText());
				
	   
		
		

	}

}
