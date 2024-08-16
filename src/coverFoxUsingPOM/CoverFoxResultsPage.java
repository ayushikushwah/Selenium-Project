package coverFoxUsingPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResultsPage {

	//data members
	@FindBy(xpath="//div[contains(text(),'Health Insurance Plans')]") private WebElement text;
	@FindBy(xpath="//div[@id='plans-list']") private List<WebElement> noOfBanners ;	
	
	//constructors
	public CoverFoxResultsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void validatNoOfbanners()
	{
		//converting string to int because we have to compare text(string) with no of banners(int)
		String ar[] = text.getText().split(" ");
		int stringConvertedIntForDisplayedText = Integer.parseInt(ar[0]);
		int totalBanners = noOfBanners.size();
		
		if(stringConvertedIntForDisplayedText==totalBanners)
		{
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		
		
	}
	
	
	
}
