package seleniumAnalyticalCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethodForExplicitWait
{
	WebDriver driver;
	public static WebElement waitForElementPresence(WebDriver driver,By locator,int timeOut) 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator);
	}
	
	public void testCase1() 
	{
		By elementPath = By.xpath("//");
		waitForElementPresence(driver,elementPath,15).click();
	}

}
