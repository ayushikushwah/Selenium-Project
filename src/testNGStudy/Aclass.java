package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Aclass {

	@Test
	public void f()
	{
		//prints on console
		System.out.println("Ayushi");
		
		//prints on console as well as emailable report
		Reporter.log("HII",true);
		
		//prints only on emailable report
		Reporter.log("Pja",false);
		Reporter.log("Pja");
	}

}
