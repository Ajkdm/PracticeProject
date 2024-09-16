package testNG3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsToGroups 
{
	@Test(groups={"smoke","regression"})
	public void testCase1() 
	{
		System.out.println("Test Case 1, \"smoke\",\"regression\",\"functional\"");
		Assert.assertTrue(false);
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
	
}
