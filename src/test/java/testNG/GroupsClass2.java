package testNG;

import org.testng.annotations.Test;

public class GroupsClass2
{
	@Test(groups= {"smoke","regression"})
	public void method5() 
	{
		System.out.println("Method5 - smoke and regression");
	}

	@Test(groups="regression")
	public void method6() 
	{
		System.out.println("Method6 - regression");
	}


	@Test(groups= {"smoke","Functionality"})
	public void method7() 
	{
		System.out.println("Method7 - smoke and Functionality");
	}

	@Test(groups="functionality")
	public void method8() 
	{
		System.out.println("method8 - functionality");
	}
	
	@Test(groups="sanity")
	public void method9() 
	{
		System.out.println("method9 - sanity");
	}
}
