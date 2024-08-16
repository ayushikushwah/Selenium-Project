package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EngVSInd {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.google.com/search?q=ind+vs+eng+scorecard+2024&oq=ind+vs+eng+sco&gs_lcrp=EgZjaHJvbWUqDQgDEAAYgwEYsQMYgAQyBggAEEUYOTIHCAEQABiABDINCAIQABiDARixAxiABDINCAMQABiDARixAxiABDIHCAQQABiABDINCAUQABiDARixAxiABDINCAYQABiDARixAxiABDIGCAcQABgDMgcICBAAGIAEMgcICRAAGIAE0gEKMTE3OTVqMGoxNagCCLACAQ&sourceid=chrome&ie=UTF-8#sie=m;/g/11vpfvpzgh;5;/m/026y268;cms;fp;1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		
		//total rows
		List<WebElement> tR = driver.findElements(By.xpath("(//table[contains(@class,'imspo')])[1]//tbody"));
		int totalRow = tR.size();
		System.out.println(totalRow);
//		
//		//total columns
//		List<WebElement> tC = driver.findElements(By.xpath(""));
//		int totalCol = tC.size();
//		System.out.println(totalCol);
		
		//read particular data from table
		WebElement element =driver.findElement(By.xpath("(//table[contains(@class,'imspo')])[1]//tbody[3]/tr[2]/td[5]/span"));
		String data =  element.getText();
		System.out.println(data);
		
		//read full data for row
		//read full data for column

	}

}
