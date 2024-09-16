package seleniumProject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WithoutSendKeys 
{

	@Test 
	public void m1() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.id("APjFqb"));
		element.sendKeys("abcdefgh");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = 'your text';", element);
		driver.findElement(By.id("")).sendKeys("abcdef");
	
	}
}
 	 	