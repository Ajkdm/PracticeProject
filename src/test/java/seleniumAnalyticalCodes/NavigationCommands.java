package seleniumAnalyticalCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommands 
{
	@Test
	public void method1() throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//URL url=new URL("https://www.google.com/");
		
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("selenium");
		searchBox.submit();
		Thread.sleep(5000);
		driver.navigate().back();
	}
}
