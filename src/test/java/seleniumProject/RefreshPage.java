package seleniumProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RefreshPage
{
@Test
public void refresh() 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	
	driver.manage().window().maximize();
	
	
	//driver.navigate().refresh();
	System.out.println(1);
	//   or
	
	//driver.get(driver.getCurrentUrl());
	
	System.out.println(2);
	//	or
	//driver.navigate().to(driver.getCurrentUrl());
	
	System.out.println(3);
	//	or
	
	//Actions actions=new Actions(driver);
	//actions.keyDown(Keys.F5).perform();
	
	System.out.println(4);
	//or
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("location.reload()");
	
	System.out.println(5);
	
	//driver.close();
	}
}
