package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
	@Test
	public void f() {

		System.out.println("Hi");
		Reporter.log("Ayushi");
	}
	@Test //-->single test case || single test method
	public void f2() {
		System.out.println("Good  morning");// -->display on console but not on emailable report
		Reporter.log("Good  evening", false);// -->display on console but not on emailable report
		Reporter.log("Good  night", true);// -->display on console as well as on emailable report

	}


	
}
