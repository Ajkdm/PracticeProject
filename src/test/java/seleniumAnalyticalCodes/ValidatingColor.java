package seleniumAnalyticalCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidatingColor 
{
	WebDriver driver;
	@Test 
	public void elementColor() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		String expectedColor="#0033a0";
		WebElement element = driver.findElement(By.xpath("//h4[text()='Selenium IDE']"));
		String color=element.getCssValue("color");
		String realColor=Color.fromString(color).asHex();
		System.out.println(color);
		System.out.println(realColor);
		 
		Assert.assertEquals(realColor, expectedColor);
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("input")));
	}
}
