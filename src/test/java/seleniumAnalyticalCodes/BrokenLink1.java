package seleniumAnalyticalCodes;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink1 
{
	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.amazon.in/");
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			
			for(WebElement link:links) 
			{
				 String newLink=link.toString();
				 URI uri = URI.create(newLink);
				  
				  HttpURLConnection connection=(HttpURLConnection)uri.toURL().openConnection();
				  
				  connection.setRequestMethod("HEAD");
				  int statusCode=connection.getResponseCode();
				  
				  if(statusCode>=400) 
				  {
					  System.out.println("Link is broken");
				  }
				  
				  else 
				  {
					  System.out.println("Link is not broken");
				  }
			}
		 
	}
}
