package testNG;

import org.testng.annotations.Test;

public class InvocationCount_InvocationTimeOut_ThreadPoolSize 
{
	
	@Test(invocationCount=2,invocationTimeOut=3000,threadPoolSize=2)
	public void method1() throws InterruptedException 
	{
		Thread.sleep(5000);
		System.out.println("Method1 "+Thread.currentThread().toString());
	}
	
	@Test(invocationCount=4)
	public void method2() 
	{
		System.out.println("Method2 "+Thread.currentThread().toString());
	}
	
	@Test(invocationCount=4)
	public void method3() 
	{
		System.out.println("Method3 "+Thread.currentThread().toString());
	}
	
	@Test(invocationCount=4)
	public void method4() 
	{
		System.out.println("Method4 "+Thread.currentThread().toString());
	}
}
