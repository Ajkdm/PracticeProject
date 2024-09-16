package testNG3;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ListenerClass1.class)
public class TestMethodsForListeners 
{
	@Test
	public void testMethod1() 
	{
		
	}
	
	@Test
	public void testMethod2() 
	{
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="testMethod2")
	public void testMethod3() 
	{
		
	}
	
	@Test(successPercentage=80)
	public void testMethod4() 
	{
		
	}
	
	@Test(invocationTimeOut=1000)
	public void testMethod10() throws Exception 
	{
		Thread.sleep(2000);
	}
	
	

}
