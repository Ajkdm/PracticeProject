package testNG3;

import org.testng.annotations.Test;

public class GroupsClass1 
{
	@Test(groups={"smoke","regression"})
	public void testCase1() 
	{
		System.out.println("Test Case 1, \"smoke\",\"regression\",\"functional\"");
	}
	
	@Test(groups="functional")
	public void testCase2() 
	{
		System.out.println("Test Case 2, \"functional\"");
	}
	
	@Test(groups="functional")
	public void testCase3() 
	{
		System.out.println("Test Case 3, \"functional\"");
	}
	
	@Test(groups="sanity")
	public void testCase4() 
	{
		System.out.println("Test Case 4, \"sanity\"");
	}
	
	@Test(groups="system")
	public void testCase5() 
	{
		System.out.println("Test Case 5, \"system\"");
	}
	
	@Test(groups="system")
	public void testCase6() 
	{
		System.out.println("Test Case 6, \"system\"");
	}
	
	@Test(groups="windows.sanity")
	public void testCase7() 
	{
		System.out.println("Test Case 6, \"windows.sanity\"");
	}
	

	@Test(groups="windows.regression")
	public void testCase8() 
	{
		System.out.println("Test Case 6, \"windows.regression\"");
	}
	
	@Test(groups="ios.sanity")
	public void testCase9() 
	{
		System.out.println("Test Case 6, \"ios.sanity\"");
	}
	
	@Test(groups="ios.regression")
	public void testCase10() 
	{
		System.out.println("Test Case 6, \"ios.regression\"");
	}
	
	
}
