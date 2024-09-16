package testNG3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class ParametersClass
{
	WebDriver driver;
	@Parameters({"url","email","pwd","expTitle"})
	@Test
	public void testCase1(String url,String email,String pwd,String expTitle) 
	{
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		System.out.println(driver.getTitle());
		String actualTitle=driver.getTitle();
		String expectedTitle=expTitle;
		
		//Hard Assert
	//	Assert.assertEquals(actualTitle, expectedTitle);
		
		//Soft Assert
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle);
		soft.assertAll();
		
	}
	
	@Parameters("browserName")
	@BeforeTest
	public void beforeTest(String browserName) 
	{
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) 
		{
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
