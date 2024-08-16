package failedXML;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failedTestXML {
	
	@Test
	public void a()
	{
//		Assert.fail();
		Reporter.log("a",true);
	}
	@Test
	public void b()
	{
		Reporter.log("b",true);
	}
	@Test
	public void c()
	{
		Reporter.log("c",true);
	}
	@Test
	public void d()
	{
//		Assert.fail();
		Reporter.log("d",true);
	}

}
