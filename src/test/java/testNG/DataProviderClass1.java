package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass1
{
	@Test(dataProvider="getData")
	public void method1(String email,String password) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@DataProvider(parallel=true)
	public String[][] getData()
	{
		String[][] data=new String[2][2];
		data[0][0]="abcdef";
		data[0][1]="123456";
		data[1][0]="ghijkl";
		data[1][1]="7891234";
		
		return data;
	}
}
