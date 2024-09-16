package testNG;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerClass.class)
public class ListenerTestCasesAtClassLevel 
{
	@Test
	public void method1() 
	{
		System.out.println("method1");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="method1")
	public void method2() 
	{
		System.out.println("method2");
	}
	
	@Test
	public void method3() 
	{
		System.out.println("method3");
	}
	
	@Test
	public void method4() 
	{
		System.out.println("method4");
	}
	
	@Test(timeOut=2000)
	public void method5() throws InterruptedException 
	{
		System.out.println("method5");
		Thread.sleep(4000);
	}
	
	@Test
	public void method6() 
	{
		System.out.println("method6");
	}
}
