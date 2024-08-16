package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutTest {
	@Test
	public void a()
	{
		Reporter.log("a is running",true);
	}
	@Test(timeOut = 5000)
	public void b() throws InterruptedException
	{
		Thread.sleep(7000);
		Reporter.log("b is running",true);
	}
	@Test
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
