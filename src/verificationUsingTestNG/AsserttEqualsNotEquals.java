package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserttEqualsNotEquals {
	@Test
	public void f() {
		String a = "Pune";
		String b = "Pune";
		String c = "Mumbai";

		// Assertion Error Message--> prints the message in cosole

		Assert.assertEquals(c, b, "Value of a and b is not matching");

//		Assert.assertNotEquals(a, b, "Value of a and b are matching");
//
//		Assert.assertNotEquals(b, c, "Value of b and c are matching");

	}

}
