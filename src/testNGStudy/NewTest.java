package testNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	//Test Suite --> multiple Test --> classes -->method
	//to execute sequence we use annotations of testng
	
  @Test
  public void f() {
	  Reporter.log("Test method is runnning",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Before method is running",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("After method is ruuning",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("Before class is running",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("After class is running",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("Before test is running",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("After test is running",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("Before suite is running",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("After suite is running",true);
  }

}
