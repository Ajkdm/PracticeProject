package testNG3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsClass
{
	@Test(groups="smokes")
	public void testCase1() 
	{
		System.out.println("smoke group");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnGroups="smokes")
	public void testCase2() 
	{
		System.out.println("depends on smoke group");
	}
	
}
