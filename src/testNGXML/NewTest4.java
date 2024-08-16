package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest4 {

	@Test(groups= {"regression"})
	public void i()
	{
		Reporter.log("i is running",true);
	}
	@Test(groups= {"sanity"})
	public void j()
	{
		Reporter.log("j is running",true);
	}
	@Test(groups= {"sanity"})
	public void k()
	{
		Reporter.log("k is running",true);
	}
	@Test(groups= {"regression"})
	public void l()
	{
		Reporter.log("l is running",true);
	}

}
