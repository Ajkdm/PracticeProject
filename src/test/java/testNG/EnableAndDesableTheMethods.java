package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class EnableAndDesableTheMethods 
{
	@Test(enabled=true)
	public void method1() 
	{
		System.out.println("Method1");
	}
	
	@Test(enabled=false)
	public void method2() 
	{
		System.out.println("Method2");
	}
	
	@Ignore
	@Test
	public void method3() 
	{
		System.out.println("Method3");
	}
	
	@Test
	public void method4() 
	{
		System.out.println("Method4");
	}
}
