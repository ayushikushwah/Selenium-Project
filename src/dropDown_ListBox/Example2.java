package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		
		
		//1.
		WebElement day = driver.findElement(By.name("birthday_day"));		
		//2.
		Select sDay = new Select(day);
		//3.
		sDay.selectByIndex(17);		
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select sMonth = new Select(month);
		sMonth.selectByValue("8");
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select sYear = new Select(year);
		sYear.selectByVisibleText("2001");

		System.out.println(sYear.isMultiple());
		
		
	}

}
