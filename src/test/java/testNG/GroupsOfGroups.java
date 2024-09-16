package testNG;

import org.testng.annotations.Test;

public class GroupsOfGroups 
{
	@Test(groups= {"smoke"})
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
	
	
}
