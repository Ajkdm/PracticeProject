package seleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assertionss 
{
	@Test
	public void m1() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		//driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Selenium");
		//driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys(Keys.ENTER);
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("title")));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		System.out.println(driver.getTitle());
	}
}
