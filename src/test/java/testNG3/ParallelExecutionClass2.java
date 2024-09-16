package testNG3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


import org.testng.annotations.Test;

public class ParallelExecutionClass2 
{
	WebDriver driver;
	@Test
	public void testCaseFB() 
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void testCaseGoogle() 
	{
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void testCaseGmail() 
	{
		driver.get("https://accounts.google.com/");
	}
	
	@Test
	public void testCaseYoutube() 
	{
		driver.get("https://www.youtube.com/");
	}
	
	
	@BeforeMethod
	public void beforeTest() 
	{
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
}
