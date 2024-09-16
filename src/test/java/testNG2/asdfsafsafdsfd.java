package testNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class asdfsafsafdsfd

{
	public static WebDriver driver;
	
	@Test
	public void method1() throws Exception 
	{
		TestClass1 test=new TestClass1();
		test.driver=new ChromeDriver();
		test.driver.manage().window().maximize();
		test.driver.get("https://www.facebook.com/login/");
		test.driver.findElement(By.id("email")).sendKeys("abcdefgh");
		test.driver.findElement(By.id("pass")).sendKeys("123456789");
		test.m1("NewFBLogin.png");
	}
	
	

}
