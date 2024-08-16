package coverFoxUsingPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CoverFoxTC {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.coverfox.com/");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		// HomePage
		CoverFoxHomePage homePage = new CoverFoxHomePage(driver);
		homePage.clickOnGetStarted();

		// Health-plan Page
		CoverFoxHealthPlanPage healthPlan = new CoverFoxHealthPlanPage(driver);
		healthPlan.clickOnNextBtn();

		// Member-details Page
		CoverFoxMemberDetailsPage memberaDetails = new CoverFoxMemberDetailsPage(driver);
		memberaDetails.selectAge();
		memberaDetails.clickOnNextBtn();

		// address-details page
		CoverFoxAddressDetailsPage addressDetails = new CoverFoxAddressDetailsPage(driver);
		addressDetails.enterPinCode();
		addressDetails.enterMobileNo();
		addressDetails.clickOnContinueBtn();

		// result page
		Thread.sleep(2000);
		CoverFoxResultsPage resultPage = new CoverFoxResultsPage(driver);
		resultPage.validatNoOfbanners();

		Thread.sleep(3000);
		driver.close();
	}

}
