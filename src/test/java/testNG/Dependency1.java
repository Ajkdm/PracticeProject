package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency1 
{
	/*
	 * @Test() public void login() { System.out.println("Login successfull");
	 * Assert.assertTrue(false); }
	 */
	
	@Test(dependsOnMethods="verifyTaskCreation")
	public void logout() 
	{
		System.out.println("logout");
	}
	
	@Test(dependsOnMethods="createTask",alwaysRun=true)
	public void verifyTaskCreation() 
	{
		System.out.println("verifyTaskCreation");
	}
	
	@Test(dependsOnMethods="login",ignoreMissingDependencies=true)
	public void createTask() 
	{
		System.out.println("createTask");
	}

}
