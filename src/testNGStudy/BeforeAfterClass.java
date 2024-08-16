package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterClass {

	// 1 --> We have only one class so before and after class will run only once
	// 2 -->but we have multiple test methods so before and after method will run depend
	// upon how many test methods you have

	@Test
	public void f() {
		Reporter.log("Test1 is running", true);
	}

	@Test
	public void f1() {
		Reporter.log("Test2 is ruuning", true);
	}

	@BeforeMethod
	public void BeforeMethod() {
		Reporter.log("Before method is ruuning", true);
	}

	@AfterMethod
	public void AfterMethod() {
		Reporter.log("After method is ruuning", true);
	}

	@BeforeClass
	public void BeforeClass() {
		Reporter.log("Before Class is running", true);
	}

	@AfterClass
	public void AfterClass() {
		Reporter.log("After Class is running", true);
	}
}
