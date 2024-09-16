package testNG3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OnTestFailureWithSuccesPercentageClass 
{
	private int i = 0;
	 @Test(successPercentage = 60, invocationCount = 5)
	 public void sampleTest3() 
	 {
	 i++;
	 System.out.println("Test Failed But Within Success Percentage Test Method, invocation count: " + i);
	 if (i == 1 || i == 2) 
	 {
	 System.out.println("sampleTest3 Failed");
	 Assert.assertEquals(i, 6);
	 }
	 }
}
