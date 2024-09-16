package testNG3;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerClass1.class)
public class TestMethodsForListeners3 
{
	@Test
	public void testMethod5() 
	{
		
	}
	
	@Test
	public void testMethod6() 
	{
		Assert.assertTrue(false);
	}
	
	@Test(successPercentage = 80)
	public void testMethod7() 
	{
		
	}
	@Test(dependsOnMethods ="testMethod6")
	public void testMethod8() 
	{
		
	}
	
	@Test(invocationTimeOut=1000)
	public void testMethod9() throws Exception 
	{
		Thread.sleep(2000);
	}
	private int i = 0;
	 @Test(successPercentage = 60, invocationCount = 5)
	 public void sampleTest3() {
	 i++;
	 System.out.println("Test Failed But Within Success Percentage Test Method, invocation count: " + i);
	 if (i == 1 || i == 2) {
	 System.out.println("sampleTest3 Failed");
	 Assert.assertEquals(i, 6);
	 }
	 }
	
	

}
