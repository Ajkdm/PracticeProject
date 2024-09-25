package seleniumAnalyticalCodes;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadlessBrowsers 
{
	WebDriver driver;
	@Test
	public void chromeHeadless() 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		driver=new ChromeDriver(options);
	}
	
	@Test
	public void edgeHeadless() 
	{
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		driver=new EdgeDriver(options);
	}
	
	@Test
	public void fireFoxHeadless() 
	{
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		driver=new FirefoxDriver(options);
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void htmlUnitDriver() 
	{
		driver=new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
	
}
