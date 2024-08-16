package CoverFoxUsingPOMAndExcel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.Utility;

public class CoverFoxUsingTestNGMobNoANDPinCodeValidate {

	WebDriver driver;
	CoverFoxHomePage homePage;
	CoverFoxHealthPlanPage healthPage;
	CoverFoxAddressDetailsPage addressPage;
	CoverFoxMemberDetailsPage memberDetails;
	CoverFoxResultsPage resultPage;
	String filePath;

	@BeforeTest
	public void launchBrowser() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://www.coverfox.com/");

		homePage = new CoverFoxHomePage(driver);
		healthPage = new CoverFoxHealthPlanPage(driver);
		addressPage = new CoverFoxAddressDetailsPage(driver);
		memberDetails = new CoverFoxMemberDetailsPage(driver);
		resultPage = new CoverFoxResultsPage(driver);
		filePath = System.getProperty("user.dir")+"\\CoverFox.xlsx";
	}

	@BeforeClass
	public void preConditions() throws IOException, InterruptedException {
		// Home-Page
		Thread.sleep(10000);
		homePage = new CoverFoxHomePage(driver);
		homePage.clickOnGetStarted();

		// Health-Plan Page
		Thread.sleep(2000);
		healthPage = new CoverFoxHealthPlanPage(driver);
		healthPage.clickOnNextBtn();

		// Member-details Page
		Thread.sleep(2000);
		memberDetails = new CoverFoxMemberDetailsPage(driver);
//		memberDetails.selectAgeDropDown(age);
		memberDetails.selectAgeDropDown(Utility.getExcelData(filePath, "Sheet3", 5, 2));
		memberDetails.clickOnNextBtn();

		Thread.sleep(2000);

		// Address-Details Page
		addressPage = new CoverFoxAddressDetailsPage(driver);
		addressPage.enterPinCode(Utility.getExcelData(filePath, "Sheet3", 5, 0));
		addressPage.enterMobileNumber(Utility.getExcelData(filePath, "Sheet3", 5, 1));
		addressPage.clickOnContinueBtn();

		Thread.sleep(2000);
	}

	@Test
	public void validateErrorMsgOfPinCode() {
		String pinCodeErrorMsg = "Please enter a valid pincode";
		String actualErroeMsg = addressPage.getPinCodetext();
		Assert.assertEquals(pinCodeErrorMsg, actualErroeMsg, "Msg Are not Matching , Tc is failed");

	}

	@Test
	public void validateErrorMsgOfMobNo() throws InterruptedException {
		String mobNoErrorMsg = "Please enter a valid mobile no.";
		String actualErroeMsg = addressPage.getMobNoText();
		Assert.assertEquals(mobNoErrorMsg, actualErroeMsg, "Msg Are not Matching , Tc is failed");

	}

	@AfterClass
	public void goToTheResultPage() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		// address-page
		Thread.sleep(3000);
		addressPage.clearPinCode();
		addressPage.enterPinCode(Utility.getExcelData(filePath, "Sheet3", 4, 0));
		addressPage.enterMobileNumber(Utility.getExcelData(filePath, "Sheet3", 4, 1));
		addressPage.clickOnContinueBtn();

	}

	@AfterTest()
	public void closeBrowser() throws InterruptedException

	{
//		Thread.sleep(3000);
//		driver.close();
	}
}
