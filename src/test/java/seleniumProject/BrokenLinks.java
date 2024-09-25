package seleniumProject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrokenLinks
{
	@Test
	public void brokenLink() 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		int brokenLinks=0;
		for(WebElement link:allLinks) 
		{
			String linkValue=link.getAttribute("href");
			if(linkValue==null || linkValue.isEmpty()) 
			{
				continue;
			}
	//		System.out.println(linkValue);
			try 
			{
			URI uri=URI.create(linkValue);
			HttpURLConnection connection=(HttpURLConnection)uri.toURL().openConnection();
			connection.connect();
			if(connection.getResponseCode()>=400) 
			{
				System.out.println(linkValue);
				brokenLinks++;
			}
			}
			catch(Exception e) 
			{}
			
		}
		System.out.println(brokenLinks);
	}
}
