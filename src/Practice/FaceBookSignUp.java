package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSignUp {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("Ayushi");
		driver.findElement(By.name("lastname")).sendKeys("Kushawah");		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ayu@123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password_step_input")).sendKeys("123");
		
		//1.
		WebElement day = driver.findElement(By.name("birthday_day"));		
		//2.
		Select sDay = new Select(day);
		//3.
		sDay.selectByIndex(17);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select sMonth = new Select(month);
		sMonth.selectByValue("8");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select sYear = new Select(year);
		sYear.selectByVisibleText("2001");
		
		//radioButton
		driver.findElement(By.xpath("//input[contains(@id,'u_0_4')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
