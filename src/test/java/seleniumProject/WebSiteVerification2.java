package seleniumProject;

import org.testng.annotations.Test;

public class WebSiteVerification2 
{
@Test
public void launchURL() 
	{
	System.out.println("Launched URL Successfully");
	}

@Test
public void login() 
	{
	System.out.println("Logged in Successfully");
	}

@Test
public void verifyTitle() 
	{
	System.out.println("Title Verified");
	}

@Test
public void logout() 
	{
	System.out.println("Logged Out");
	}
}
