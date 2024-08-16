package coverFoxUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPage {

	// data members
	@FindBy(xpath = "(//input[@type='number'])[1]")
	private WebElement pinCodeField;
	@FindBy(xpath = "(//input[@type='number'])[2]")
	private WebElement mobileNoField;
	@FindBy(xpath="//div[@class='next-btn']")private WebElement continusBtn;
	
	// constructor
	public CoverFoxAddressDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// methods
	public void enterPinCode()
	{
		pinCodeField.sendKeys("440022");
	}
	
	public void enterMobileNo()
	{
		mobileNoField.sendKeys("9031275714");
	}
	
	public void clickOnContinueBtn()
	{
		continusBtn.click();
	}
}
