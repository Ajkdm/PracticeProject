package testNG3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsClass1
{
	@Test()
	public void testCase1() 
	{
		System.out.println("Test Case 1, \"smoke\",\"regression\",\"functional\"");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="testCase1")
	public void testCase2() 
	{
		System.out.println("Test Case 2, \"functional\"");
	}
	
	@Test(dependsOnMethods="testCase2")
	public void testCase3() 
	{
		System.out.println("Test Case 3, \"functional\"");
	}
	
	@Test(dependsOnMethods="testCase3")
	public void testCase4() 
	{
		System.out.println("Test Case 4, \"sanity\"");
	}
	
	@Test(dependsOnMethods="testCase4")
	public void testCase5() 
	{
		System.out.println("Test Case 5, \"system\"");
	}
	
	@Test(dependsOnMethods="testCase5")
	public void testCase6() 
	{
		System.out.println("Test Case 6, \"system\"");
	}
}
