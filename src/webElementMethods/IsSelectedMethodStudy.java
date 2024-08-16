package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodStudy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		
		//3.cssSelector --> tag and attribute
		WebElement radioButton1 = driver.findElement(By.cssSelector("input[value='radio1']"));
		radioButton1.click();
		
		//System.out.println(radioButton1.isSelected());-->true or false
		
		if(radioButton1.isSelected())
		{
			System.out.println("Radio Button is alredy selected,Thank you !!");
		}
		else {
			radioButton1.click();//select the radio button
			System.out.println("Radio Button is now selected !!");
		}

	}

}
