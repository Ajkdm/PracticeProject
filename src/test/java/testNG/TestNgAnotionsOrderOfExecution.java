package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnotionsOrderOfExecution 
{
	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println(">>>>>>>>>>>>>>>>Before Suite<<<<<<<<<<<<<<<");
	}
	
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println(">>>>>>>>>>>>>>>>Before Test<<<<<<<<<<<<<<<");
	}
	
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println(">>>>>>>>>>>>>>>>Before Class<<<<<<<<<<<<<<<");
	}
	
	@BeforeMethod
	public void beforemethod() 
	{
		System.out.println(">>>>>>>>>>>>>>>>Before method<<<<<<<<<<<<<<<");
	}
	
	@AfterSuite
	public void afterSuite() 
	{
		System.out.println(">>>>>>>>>>>>>>>>after Suite<<<<<<<<<<<<<<<");
	}
	
	@AfterTest
	public void afterTest() 
	{
		System.out.println(">>>>>>>>>>>>>>>>after Test<<<<<<<<<<<<<<<");
	}
	
	@AfterClass
	public void afterClass() 
	{
		System.out.println(">>>>>>>>>>>>>>>>after Class<<<<<<<<<<<<<<<");
	}
	
	@AfterMethod
	public void aftermethod() 
	{
		System.out.println(">>>>>>>>>>>>>>>>after method<<<<<<<<<<<<<<<");
	}
	
	//====================================================================
	@Test
	public void method1() 
	{
		System.out.println("method1");
	}
	
	@Test
	public void method2() 
	{
		System.out.println("method2");
	}
	
	@Test
	public void method3() 
	{
		System.out.println("method3");
	}
	
	@Test
	public void method4() 
	{
		System.out.println("method4");
	}
	
	@Test(timeOut=2000)
	public void method5()
	{
		System.out.println("method5");
	
	}
	
	@Test
	public void method6() 
	{
		System.out.println("method6");
	}
}
