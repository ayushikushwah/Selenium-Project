package ListenersStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{
	

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("TC "+result.getName()+" exceution is started",true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TC "+result.getName()+" failed",true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("Tc"+result.getName()+"is successful or passed",true);
	}
	
	
}
