package testNG3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsingDataProviderExcelDataFromOtherCalss 
{
	@Test(dataProvider="getData",dataProviderClass=DataProviderUsingExcelSheet.class)
	public void testCase1(String un,String pwd) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		System.out.println(driver.getTitle());
		String actualTitle=driver.getTitle();
		String expectedTitle="gFacebook – log in or sign up";
		
		//Hard Assert
	//	Assert.assertEquals(actualTitle, expectedTitle);
		
		//Soft Assert
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle);
		soft.assertAll();
	}

}
