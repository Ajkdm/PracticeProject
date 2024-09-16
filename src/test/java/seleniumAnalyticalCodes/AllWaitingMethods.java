package seleniumAnalyticalCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllWaitingMethods 
{

	public void method1() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("");
		WebElement element = driver.findElement(By.id("element"));
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		//Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		
		//FluentWait
		FluentWait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(30));
		fluentWait.pollingEvery(Duration.ofSeconds(5));
		fluentWait.ignoring(NoSuchElementException.class,StaleElementReferenceException.class);
		
		fluentWait.until(ExpectedConditions.visibilityOf(element)).click();
		
	}
}
