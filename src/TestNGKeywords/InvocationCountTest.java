package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount = 0)
	//keywords should be always return after @Test
	//invocation cant be zero or negative ,its default  value is 1 otherwise it will give below error
	//[TestNG] No tests found. Nothing was run --> there is mistake in configurations
	public void a()

	{
		Reporter.log("Test method is running",true);
	}
	
	@AfterMethod//it will execute 2 times because the invocation count fot test is 2
	public void  afterMethod()
	{
		System.out.println("after method is running");
	}
}
