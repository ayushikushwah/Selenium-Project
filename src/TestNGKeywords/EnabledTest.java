package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledTest {
	//enabled = false will disable that particular @test method and it will not get executed
	//willbe displayed in index.html under ignore methods
	//default value is true
	@Test
	public void a()
	{
		Reporter.log("a is running",true);
	}
	@Test
	public void b()
	{
		Reporter.log("b is running",true);
	}
	@Test(enabled = false)
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
