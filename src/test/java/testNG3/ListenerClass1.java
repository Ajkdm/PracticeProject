package testNG3;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass1 implements ITestListener
{
	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("OnStart>>>>> "+"<<<<<<OnStart>>>>>>>");
	}
	
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("OnTestStart>>>>> "+result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("OnTestSuccess>>>>> "+result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("OnTestSkipped>>>>> "+result.getMethod().getMethodName());
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("OnTestFailure>>>>> "+result.getMethod().getMethodName());
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println("OnTestFailedButWithSuccessPercentage>>>>>"+result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		System.out.println("OnTestFailedWithTimeOut>>>> "+result.getMethod().getMethodName());
	}

	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("OnFinish>>>>> "+"<<<<<<OnFinish>>>>>>>");
		System.out.println("-----------------------------------------------------");
	}

}
