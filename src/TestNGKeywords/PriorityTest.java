package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityTest {
	
	//if class has multiple @test method it will execute in alphabetical order
	//-ve then 0 and then +ve
	//if all priorities are same for diff methods then it will execite as per alphabetical order
	//default value is 0 and it cant be factional or alphabets

		@Test(priority = -2)
		public void a()
		{
			Reporter.log("a is running",true);
		}
		@Test(priority = 1)
		public void b()
		{
			Reporter.log("b is running",true);
		}
		@Test(priority = 3)
		public void c()
		{
			Reporter.log("c is running",true);
		}
		@Test(priority = -4)
		public void d()
		{
			Reporter.log("d is running",true);
		}


}
