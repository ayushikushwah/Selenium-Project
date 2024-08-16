package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalse {
	
	@Test
	public void f()
	{
		boolean a = true;
		boolean b = false;
		
//		Assert.assertTrue(a,"Value is false , Test Case is failed");
		
		Assert.assertFalse(a,"Value is true ,Test case is failed");
	}

}
