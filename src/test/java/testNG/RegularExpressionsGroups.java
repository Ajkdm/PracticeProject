package testNG;

import org.testng.annotations.Test;

public class RegularExpressionsGroups 
{
	@Test(groups= {"ios.smoke","ios.regression"})
	public void method1() 
	{
		System.out.println("Method1 - ios - smoke and regression");
	}

	@Test(groups="ios.regression")
	public void method2() 
	{
		System.out.println("Method2 - ios - regression");
	}


	@Test(groups= {"ios.smoke","ios.Functionality"})
	public void method3() 
	{
		System.out.println("Method3 - ios - smoke and Functionality");
	}

	@Test(groups="ios.functionality")
	public void method4() 
	{
		System.out.println("method4 - ios - functionality");
	}

	@Test(groups="ios.sanity")
	public void method10() 
	{
		System.out.println("method10 -ios - sanity");
	} 
	
	@Test(groups= {"windows.smoke","windows.regression"})
	public void method5() 
	{
		System.out.println("Method5 - windows - smoke and regression");
	}

	@Test(groups="windows.regression")
	public void method6() 
	{
		System.out.println("Method6 - windows - regression");
	}


	@Test(groups= {"windows.smoke","windows.Functionality"})
	public void method7() 
	{
		System.out.println("Method7 - windows - smoke and Functionality");
	}

	@Test(groups="windows.functionality")
	public void method8() 
	{
		System.out.println("method8 - windows - functionality");
	}

	@Test(groups="windows.sanity")
	public void method9() 
	{
		System.out.println("method9 - sanity");
	}
	
}
