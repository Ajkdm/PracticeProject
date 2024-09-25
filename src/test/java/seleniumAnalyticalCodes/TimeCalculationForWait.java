package seleniumAnalyticalCodes;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TimeCalculationForWait
{
	@Test
	public void m1() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Instant startTime=Instant.now();
		try {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("abcd"))));

		}
		catch(Exception e2) {}
		Instant endTime=Instant.now();
		
		long totalTime=Duration.between(startTime, endTime).toSeconds();
		System.out.println(totalTime);
	}
}
