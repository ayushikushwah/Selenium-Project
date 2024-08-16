package coverFoxUsingPOM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PracticeCoverFoxTC {

	public static void main(String[] args) throws InterruptedException {
		
		//Count The Number of Banners are equals to the 
		
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
//		driver.manage().window().maximize();
		
		//HomePage
		driver.findElement(By.xpath("//button[@title='Get Started']")).click();
		
		//Health-Plan page
		driver.findElement(By.xpath("//div[text()=' Next ']")).click();
		
		//member-details Page
		WebElement ageDropDown = driver.findElement(By.id("Age-You"));
		Select s = new Select(ageDropDown);
		s.selectByIndex(8);
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		
		//address-details
		driver.findElement(By.xpath("(//input[@inputmode='numeric'])[1]")).sendKeys("440022");
		driver.findElement(By.id("want-expert")).sendKeys("7326869186");
		driver.findElement(By.xpath("(//div[text()='Continue'])[1]")).click();
		
		//results
		//while finding text dont use 50 because it may vary so using contains() also
		Thread.sleep(2000);
		String text =driver.findElement(By.xpath("//div[contains(text(),'matching')]")).getText();
		System.out.println("Text : "+text);		
		List<WebElement> elements =driver.findElements(By.xpath("//div[@id='plans-list']"));
		int noOFBanners = elements.size();
		System.out.println("Total Banners :"+noOFBanners);
		
		//split the strig to get the particular index which is 0
		String ar[] = text.split(" ");
		String splitString = ar[0];
		//we cannot compare size(int) with splitString(String)
		//thats why converting string to int --> string1
		int splitStringConvertedInt = Integer.parseInt(splitString);
		System.out.println("Matchig Number: "+splitStringConvertedInt);
		if(noOFBanners == splitStringConvertedInt)
		{
			System.out.println("Test Case passed");
		}
		else {
			System.out.println("Test Case failed");
		}
		

	}

}
