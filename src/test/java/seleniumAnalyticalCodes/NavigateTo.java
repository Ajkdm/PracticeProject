package seleniumAnalyticalCodes;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateTo 
{
	@Test
	public void htmlUnitDriver1() throws MalformedURLException 
	{
		WebDriver driver=new ChromeDriver();
		//Object str=new String("https://www.google.com/");
		URL uri=URI.create("https://www.google.com/").toURL();
	//	driver.get(str);
		driver.navigate().to(uri);
		System.out.println(driver.getTitle());
		driver.close();
	}
}
