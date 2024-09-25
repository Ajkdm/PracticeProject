package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class IncogniotoLaunch 
{
	@Test
	public void chromeIncognito()
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(option);			
	}
	
	@Test
	public void edgeIncognito()
	{
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--inprivate");
		WebDriver driver=new EdgeDriver(options);
	}
	
	@Test
	public void FireFoxIncognito()
	{
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("-private");
		WebDriver driver=new FirefoxDriver(options);
	}

}
