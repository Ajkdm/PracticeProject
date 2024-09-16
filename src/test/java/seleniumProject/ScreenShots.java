package seleniumProject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScreenShots 
{
	WebDriver driver;
	
	@Test
public void screenShots() throws IOException 
	{
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot screen=(TakesScreenshot)driver;
		File sourceFile = screen.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screen Shots/abcd.png");
		Files.copy(sourceFile, destination);
		driver.close();
	}
}
