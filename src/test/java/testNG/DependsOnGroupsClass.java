package testNG;

import org.testng.annotations.Test;

public class DependsOnGroupsClass 
{
	@Test(groups= {"smoke","regression"})
	public void method1() 
	{
		System.out.println("Method1 - smoke and regression");
	}

	@Test(groups= "regression")
	public void method2() 
	{
		System.out.println("Method2 - regression");
	}

	
	@Test(groups= {"regression","functionality"})
	public void method3() 
	{
		System.out.println("Method3 - regression and functionality");
	}

	@Test(groups="functionality")
	public void method4() 
	{
		System.out.println("Method4 - functionality");
	}
	
	@Test(groups="sanity")
	public void method10() 
	{
		System.out.println("Method10 - sanity");
	}
	
	@Test(dependsOnGroups="smoke")
	public void method11() 
	{
		System.out.println("Method11 - dependsOnGroups smoke");
	}
	

	@Test(dependsOnGroups="sanity")
	public void method12() 
	{
		System.out.println("Method12 - dependsOnGroups sanity");
	}
}
