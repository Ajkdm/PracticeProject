package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAtSuiteLevelAndTestLevel
{
	WebDriver driver;
	
	@Parameters({"browserName","url"})
	@BeforeTest
	public void launchBrowser(String browserName,String url) 
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();	
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
	}
	
	@Test
	@Parameters({"email","password"})
	public void testCase1(String email,String password) 
	{
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Log in to Facebook");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
}
