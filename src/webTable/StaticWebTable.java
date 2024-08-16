package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		// xpath for table
		driver.findElement(By.xpath("//table[@id='customers']"));

		// how many rows
		List<WebElement> totalR = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int totalRows = totalR.size();
		System.out.println("Total rows : " + totalRows);

		// how many columns
		List<WebElement> totalC = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		int totalColumns = totalC.size();
		System.err.println("Total Columns : " + totalColumns);

		// how to read perticular data(full row) from table
		String text = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[2]")).getText();
		System.out.println("Particular data : " + text);

		// how to read perticular row from table

		// WebElement row =
		// driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[1]"));
		// row.getText();

		// for loop of columns because columns are chnaging and row is stable

		System.out.println("Particular row : ");
		for (int i = 1; i <= totalColumns; i++) {
			WebElement row = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[" + i + "]"));
			String rtext = row.getText();
			System.out.print(rtext + " ");
		}

		// how to read perticular column from table

//	 WebElement column = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]"));
//	 String ctext=column.getText();
//	 System.out.println(ctext);
		System.out.println();
		// loop of rows because column is fixed and row is changing
		System.out.println("Particular Column :");
		for (int i = 2; i <= totalRows; i++) {
			WebElement column = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[3]"));
			String ctext = column.getText();
			System.out.println(ctext);
		}
		System.out.println("=====================Table data : ==========================");
		// how to read all table data--> including header

		// outer loop for rows
		for (int i = 1; i <= totalRows; i++) {
			// inner loop for columns
			for (int j = 1; j <= totalColumns; j++) {

				// for header because first row is header with th tag
				if (i == 1) {
					WebElement t = driver
							.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/th[" + j + "]"));
					String tData = t.getText();
					System.out.print(tData + " ");
				} else {

					WebElement table = driver
							.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]"));
					String tableData = table.getText();
					System.out.print(tableData + " ");
				}

			}
			System.out.println();
		}
		
		// how to read all table data--> including header
		System.out.println("====================Table data : Excluding header=========================");
		//1.for header
		for(int i =1;i<=totalColumns;i++)
		{
			WebElement table = driver
					.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th[" + i + "]"));
			String tableData = table.getText();
			System.out.print(tableData + " ");
		}
		
		//2.for rows and columns
		for(int i =2;i<=totalRows;i++)
		{
			for(int j=1;j<=totalColumns;j++)
			{
				WebElement table = driver
						.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]"));
				String tableData = table.getText();
				System.out.print(tableData + " ");
			}
			System.out.println();
		}

	}

}
