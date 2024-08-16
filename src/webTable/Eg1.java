package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//using implicit wait
       //Thread.sleep(2000); -->donot use this now
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//use relative xpath thatmis //
		List<WebElement> rowsOfTables = driver.findElements(By.xpath("//table[@name='courses']//tr"));
		
		//how many rows are there?
		int totalRows = rowsOfTables.size();
		System.out.println(totalRows);
		
		//to navigate immediate child use "/"-->absolute xpath
		//to navigate any child use "//"--> relative xpath
		
		//how many columns are there?
		List<WebElement> tableColumn= 
				driver.findElements(By.xpath("//table[@name='courses']//tr[1]/th"));
		int totalColumns = tableColumn.size();
		System.out.println(totalColumns);
		
		//how to find particular data from table
		WebElement data = driver.findElement(By.xpath("//table[@name='courses']//tr[3]/td[2]"));
		String text = data.getText();
		System.out.println(text);
		
		//how to read particular row from table
		
		//table[@name='courses']//tr[5]/td[1]
		//table[@name='courses']//tr[5]/td[2]
		//table[@name='courses']//tr[5]/td[3]
		
		for(int i= 1;i<=totalColumns;i++)
		{
			WebElement row =
					driver.findElement(By.xpath("//table[@name='courses']//tr[5]/td["+i+"]"));
			String mytext = row.getText();
			System.out.println(mytext);
		}
		
		//how to find particular column from table
		//first row of column stores th which doesnot match ,hence using i from int i =2 instaed of 1;
		for(int i=2;i<=totalRows;i++)
		{
			WebElement col = driver.findElement(By.xpath(""));
			String coltext = col.getText();
			System.out.println(coltext);
		}
		
		//how to read all atble data excluding header
		
		//outer loop for rows
		for(int i=2;i<=totalRows;i++)
		{
			//inner loop for columns
			for(int j=1;i<=totalColumns;i++)
			{
				
			}
		}
		
		//to read table first take rows
		

	}

}
