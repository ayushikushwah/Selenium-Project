package CoverFoxUsingPOMAndExcel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonMethods.Utility;
import coverFoxUsingPOM.CoverFoxHealthPlanPage;
import coverFoxUsingPOM.CoverFoxHomePage;

public class CoverFoxTc {

	public static void main(String[] args)
			throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException {
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		// variables || data-members
		// reading the data from excel
		String filePath = "D:\\ayushi\\CoverFox.xlsx";
		String pinCode = Utility.getExcelData(filePath, "Sheet1", 2, 0);
		String mobileNumber = Utility.getExcelData(filePath, "Sheet1", 2, 1);
		String age = Utility.getExcelData(filePath, "Sheet1", 2, 2);

		// HomePage
		CoverFoxHomePage homePage = new CoverFoxHomePage(driver);
		homePage.clickOnGetStarted();

		// Health-plan Page
		CoverFoxHealthPlanPage healthPlan = new CoverFoxHealthPlanPage(driver);
		healthPlan.clickOnNextBtn();

		// member-details page
		CoverFoxMemberDetailsPage memberDetails = new CoverFoxMemberDetailsPage(driver);
		memberDetails.selectAgeDropDown(age);
		memberDetails.clickOnNextBtn();

		// address-details page
		CoverFoxAddressDetailsPage addressDetails = new CoverFoxAddressDetailsPage(driver);
		addressDetails.enterPinCode(pinCode);
		addressDetails.enterMobileNumber(mobileNumber);
		addressDetails.clickOnContinueBtn();

		// result page
		Thread.sleep(2000);
		CoverFoxResultsPage resultPage = new CoverFoxResultsPage(driver);
		resultPage.validateBanners();

		Thread.sleep(3000);
//		driver.close();

	}

}
