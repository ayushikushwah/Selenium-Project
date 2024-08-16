package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
	
	@Test
	public void myTest()
	{
		String a ="Pune";
		String b ="Mumbai";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a, b,"A and b are not equals , TC is failed");
		
		sa.assertNotNull(b,"Value is Null ,Tc is failed");//it should pass
//		
		sa.assertNull(b,"Value is NotNull ,Tc is failed");//it should fail
//		
		sa.assertAll();
	}
	
	@Test
	public void Test2()
	{
		boolean a = true;
		boolean b = false;
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(a, "Value is not true");
//		soft.assertTrue(a, "Value is not true");
	}

}
