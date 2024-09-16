package testNG3;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class DependecyInjectionForScreenShot 
{
	@AfterMethod
	public void screenShotCaptureForFailedTestCAse(ITestResult result) 
	{
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			//captureScreenShot
		}
	}
}
