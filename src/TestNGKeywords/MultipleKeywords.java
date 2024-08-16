package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleKeywords {

	@Test
	public void a()
	{
		Reporter.log("a is running",true);
	}
	//first priority willbe considered and then alphabetical order
	@Test(invocationCount = 2 , priority = -2)
	public void b()
	{
		Reporter.log("b is running",true);
	}
	@Test
	public void c()
	{
		Reporter.log("c is running",true);
	}
}
