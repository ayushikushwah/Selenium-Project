package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		// how many rows are there?
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		int totalrow = rows.size();
		System.out.println("No of Rows " + rows.size());

		// how many columns are there?
		List<WebElement> cols = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
		int totlcol = cols.size();
		System.out.println("No of Columns " + cols.size());

		// how to read perticular data(full row) from table
		String data = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[6]/td[2]")).getText();
		System.out.println(data);

		// how to read perticular row from table

		for (int i = 1; i <= totlcol; i++) {
			String rt = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]/td[" + i + "]")).getText();
			System.out.print(rt + " ");
		}

		// how to read perticular column from table

		for (int i = 2; i <= totalrow; i++) {
			WebElement d = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[" + i + "]/td[3]"));
			System.out.println(d.getText());
		}
		System.out.println("==========================================================");

		// how to read all table data--> including header

//		for (int i = 1; i <= totalrow; i++) {
//			for (int j = 1; j <= totlcol; j++) {
//				if (i == 1) {
//					WebElement d = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[" + i + "]/th[" + j + "]"));
//					System.out.print(d.getText()+" ");
//				} else {
//					WebElement d = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[" + i + "]/td[" + j + "]"));
//					System.out.print(d.getText() + " ");
//				}
//
//			}
//			System.out.println();
//		}
		
		// how to read all table data--> excluding header
		
		for(int i=1;i<=totlcol;i++)
		{
			WebElement theader = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[1]/th["+i+"]"));
			System.out.print(theader.getText()+" ");
		}
		
		for(int i=2;i<=totalrow;i++)
		{
			for(int j=1;j<=totlcol;j++)
			{
				WebElement t = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(t.getText()+" ");
			}
			System.out.println();
		}


	}

}
