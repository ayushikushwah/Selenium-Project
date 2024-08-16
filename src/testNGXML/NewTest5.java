package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest5 {

	@Test(groups= {"sanity"})
	public void a()
	{
		Reporter.log("a is running",true);
	}
	@Test(groups= {"regression"})
	public void b()
	{
		Reporter.log("b is running",true);
	}
	@Test(groups= {"sanity"})
	public void c()
	{
		Reporter.log("c is running",true);
	}
	@Test
	public void d()
	{
		Reporter.log("d is running",true);
	}

}
