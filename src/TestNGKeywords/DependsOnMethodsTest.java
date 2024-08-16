package TestNGKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {

 @Test
 public void a()
 {
	 Reporter.log("a is running",true);
 }
// @Test(dependsOnMethods = {"c"},priority = -4)
// @Test(dependsOnMethods = {"c"})
 @Test
 public void b()
 {
	 Reporter.log("b is running",true);
 }
// @Test(dependsOnMethods = {"b"})
 @Test
 public void c()
 {
	 //to intentionally fail the test case
	 Assert.fail();
	 Reporter.log("c is running",true);
 }
 
 //case 1 : normal when b depend on c then first c will execute then a and then b
 //case 2: if b depend on c and c depend on b it gives testNG Exception : following methods have cyclic dependencies
 //case 3: if b depends on c and c have Assert.fail(); then  a will execute and after that
 //it will give Assertion Error : null
}
