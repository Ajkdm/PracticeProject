package testNG2;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.io.Files;

@Listeners(ITestListenerForFailedTestCase.class)
public class TestClass1 
{
	public static WebDriver driver;
	public static String screenShotSubFolder;
	@Test
	public void FaceBook_LoginPage() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("abcdefgh");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		Assert.assertTrue(false);
	}
	
	public void getScreenShot(String fileName) throws IOException 
	{
		
		LocalDateTime myDateObj=LocalDateTime.now();
		DateTimeFormatter myFormatObj=DateTimeFormatter.ofPattern("dd-MM-yyyy HH mm ss");
		screenShotSubFolder=myDateObj.format(myFormatObj);
		
		TakesScreenshot screen=(TakesScreenshot)driver;
		File source=screen.getScreenshotAs(OutputType.FILE);
	
		 File dstFolder=new File("./ScreenShots/"+screenShotSubFolder);
		if (!dstFolder.exists()) {
	        dstFolder.mkdirs(); // create directory if it doesn't exist
	    }
	    File dst=new File(dstFolder, fileName);
	    Files.copy(source, dst);
		
		
	}
	
	public void m1(String name) throws Exception 
	{
		LocalDateTime now=LocalDateTime.now();
		DateTimeFormatter myFormat=DateTimeFormatter.ofPattern("dd MM yyyy HH mm ss");
		String folder = now.format(myFormat);
		
		TakesScreenshot screen=(TakesScreenshot)driver;
		File srsfile = screen.getScreenshotAs(OutputType.FILE);
		File dstFolder=new File("./ScreenShots/"+folder);
		
		if(!dstFolder.exists()) 
		{
			dstFolder.mkdir();
		}
		
		File dstFile=new File(dstFolder,name);
		Files.copy(srsfile, dstFile);
		
	}
}
