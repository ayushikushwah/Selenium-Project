package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullNotNull {
	
	@Test
	public void f()
	{
		String a="A";
		String b = null;
		
//		Assert.assertNull(a,"Value is not null , tc is failed");
		
		Assert.assertNotNull(a,"Value is null , tc is failed");
		Assert.fail();
	}

}
