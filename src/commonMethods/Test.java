package commonMethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException ,IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement showHideTextBox = driver.findElement(By.xpath("//input[@name='show-hide']"));
		Thread.sleep(2000);
		Utility.scrollIntoViewElement(driver , showHideTextBox);
		
		String FileName = "Ayushi";
		Utility.getScreenShot(driver ,FileName);
		
		String filePath="D:\\ayushi\\Players.xlsx";
		String cellValue = Utility.getExcelData(filePath ,"Sheet1", 1, 0);
		System.out.println(cellValue);
		
		Utility.getWait(driver, 2000);
		driver.findElement(By.id("checkBoxOption1")).click();
		
		
		WebElement openTabBtn = driver.findElement(By.id("opentab"));
		Utility.clickElement(driver , openTabBtn);
		
		
		
		

	}

}
