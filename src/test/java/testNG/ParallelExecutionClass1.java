package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelExecutionClass1 
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

	@DataProvider
	public String[][] getData()
	{
		String[][] data=new String[4][2];
		data[0][0]="abcdef";
		data[0][1]="123456";
		data[1][0]="ghijkl";
		data[1][1]="7891234";
		
		data[2][0]="mnopqr";
		data[2][1]="11223344";
		data[3][0]="stuvw";
		data[3][1]="0987654";
		

		return data;
	}
}
