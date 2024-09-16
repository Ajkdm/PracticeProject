package testNG2;


import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ITestListenerForFailedTestCase implements ITestListener
{
WebDriver driver;
	@Override
	public void onTestFailure(ITestResult result) 
	{
		TestClass1 test=new TestClass1();
		
			try {
				test.m1(result.getMethod().getMethodName()+".png");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	
}
