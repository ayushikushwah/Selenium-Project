package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));

		// xpath for table
		driver.findElement(By.xpath("//table[contains(@class,'tsc')]"));

		// how many rows?
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'tsc')]/tbody/tr"));
		int rCount = rows.size();
		System.out.println(rCount);

		// how many columns?
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'tsc')]/thead/tr/th"));
		int colCount = cols.size();
		System.out.println(colCount);
		// read any particular data
		String t = driver.findElement(By.xpath("//table[contains(@class,'tsc')]/tbody/tr[3]/td[2]")).getText();
		System.out.println(t);

		// read particullar row
		for (int i = 1; i < colCount; i++) {
			String rowData = driver.findElement(By.xpath("//table[contains(@class,'tsc')]/tbody/tr[3]/td[" + i + "]"))
					.getText();
			System.out.print(rowData + " ");
		}
		// read particular column
		for (int i = 1; i <= rCount; i++) {
			String colData = driver.findElement(By.xpath("//table[contains(@class,'tsc')]/tbody/tr[" + i + "]/td"))
					.getText();
			System.out.println(colData);
		}
		// read whole data of table

//		for (int i = 1; i <= rCount; i++) {
//			for (int j = 1; j <= colCount; j++) {
//				if (i == 1) {
//					String rowHeader = driver
//							.findElement(By.xpath("//table[contains(@class,'tsc')]/tbody/tr[" + i + "]/th")).getText();
//				System.out.println(rowHeader);
//				}
//				else {
//					String table = driver
//							.findElement(By.xpath("//table[contains(@class,'tsc')]/tbody/tr[" + i + "]/td[" + j + "]"))
//							.getText();
//					System.out.print(table + " ");
//				}
//				
//			}
//			System.out.println();
//		}

	}

}
