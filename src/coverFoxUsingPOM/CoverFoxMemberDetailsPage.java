package coverFoxUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMemberDetailsPage {

	// whenever using sendkeys use field aas suffix of variable name so you remeber
	// you have to send keys here
	// and button for buttons

	// data members
	@FindBy(id = "Age-You")
	private WebElement ageDropDown;
	@FindBy(xpath = "//div[text()='Next']")
	private WebElement nextBtn;

	// constructor
	public CoverFoxMemberDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// methods
	public void selectAge() {
		Select s = new Select(ageDropDown);
		s.selectByIndex(7);
	}
	
	public void clickOnNextBtn()
	{
		nextBtn.click();
	}

}
