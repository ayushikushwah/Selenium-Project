package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertDrawback {
	
	@Test
	public void f()
	{
		String a = "Pune";
		String b = "Mumbai";
		
		Assert.assertEquals(a, b,"A and b values are not matching");
		//if above line 14 is passed or failed , execution will stop and below line 16 will not get executed
		Assert.assertNull(a,"A is not null");
		
		//use swaglabs site and use all this testng concepts
		
	}
	
	@Test
	public void f1()
	{
		boolean a = true;
		boolean b = false;
		
		Assert.assertTrue(b,"Value is false");
		//if above line 14 is passed or failed , execution will stop and below line 16 will not get executed
		Assert.assertFalse(b,"Value is true");
//		Reporter.log(b);
		//use swaglabs site and use all this testng concepts
		
	}

}
