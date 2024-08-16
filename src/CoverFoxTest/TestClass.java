package CoverFoxTest;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CoverFoxBase.BaseClass;
import CoverFoxPOM.CoverFoxAddressDetailsPage;
import CoverFoxPOM.CoverFoxHealthPlanPage;
import CoverFoxPOM.CoverFoxHomePage;
import CoverFoxPOM.CoverFoxMemberDetailsPage;
import CoverFoxPOM.CoverFoxResultsPage;
import CoverFoxUtility.Utility;

public class TestClass extends BaseClass {

	CoverFoxHomePage homePage;
	CoverFoxHealthPlanPage healthPage;
	CoverFoxAddressDetailsPage addressPage;
	CoverFoxMemberDetailsPage memberDetails;
	CoverFoxResultsPage resultPage;

	@BeforeTest
	public void openBrowser()

	{
		launchBrowser();
		homePage = new CoverFoxHomePage(driver);
		healthPage = new CoverFoxHealthPlanPage(driver);
		addressPage = new CoverFoxAddressDetailsPage(driver);
		memberDetails = new CoverFoxMemberDetailsPage(driver);
		resultPage = new CoverFoxResultsPage(driver);

	}

	@BeforeClass
	public void preConditions() throws IOException , FileNotFoundException , InterruptedException

	{
		// Home-Page
		Thread.sleep(3000);
		homePage = new CoverFoxHomePage(driver);
		homePage.clickOnGetStarted();
		Reporter.log("Click on get started",true);

		// Health-Plan Page
		Thread.sleep(4000);
		healthPage = new CoverFoxHealthPlanPage(driver);
		healthPage.clickOnNextBtn();
		Reporter.log("Click on next button",true);

		// Member-details Page
		Thread.sleep(2000);
		memberDetails = new CoverFoxMemberDetailsPage(driver);
		memberDetails.selectAgeDropDown(Utility.readDataFromPeroperties("age"));
		Reporter.log("Select age",true);
		memberDetails.clickOnNextBtn();
		Reporter.log("Click on next button",true);

		Thread.sleep(2000);

		// Address-Details Page
		addressPage = new CoverFoxAddressDetailsPage(driver);
		addressPage.enterPinCode(Utility.readDataFromPeroperties("pinCode"));
		Reporter.log("enter pincode",true);
		addressPage.enterMobileNumber(Utility.readDataFromPeroperties("mobNo"));
		Reporter.log("enter mobileNo",true);
		addressPage.clickOnContinueBtn();
		Reporter.log("Click on Continue Btn",true);

		Thread.sleep(2000);
	}
	
	@Test
	public void validateBanners()

	{
		// Result-Page
		resultPage = new CoverFoxResultsPage(driver);
		Reporter.log("Validating the no of banners on result page",true);
		Assert.assertEquals(resultPage.getTotalBanners(), resultPage.getTextOnHomePage(),
				"No of Banners and text is not  matching");

	}

	@Test
	public void validatePresenceOfSortDropdown() {
		//result-page
		resultPage = new CoverFoxResultsPage(driver);
		Reporter.log("Validating the presence of sort dropdown on result page",true);
		Assert.assertTrue(resultPage.sortPlanDropdownIsDisplayed(),
				"Sort Plan Dropdown is not displayed , Tc is failed");
	}

	@AfterClass
	public void closeTheBrowser() throws InterruptedException

	{
		closeBrowser();
	}

}
