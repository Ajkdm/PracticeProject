package testNG;

import org.testng.annotations.Test;

public class TestPriorityClass 
{
	@Test(priority=-3)
	public void login() 
	{
		System.out.println("Login successfull");
	}
	
	@Test(priority=-1)
	public void logout() 
	{
		System.out.println("logout");
	}
	
	@Test(priority=-2)
	public void verifyTaskCreation() 
	{
		System.out.println("verifyTaskCreation");
	}
	
	@Test(priority=1)
	public void createTask() 
	{
		System.out.println("createTask");
	}

}
