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
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScreenShootssss 
{
	static WebDriver driver;
	static String screenShotSubFolderName;
	@Test
	public void method1() throws Exception
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("abcdefgh");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		screenShot();
		
	}
	
	public static void screenShot() throws Exception 
	{
		
		
		if(screenShotSubFolderName==null) {
		LocalDateTime myDate=LocalDateTime.now();
		DateTimeFormatter myFormat=DateTimeFormatter.ofPattern("dd-MM-yyy HH-mm-ss");
		screenShotSubFolderName=myDate.format(myFormat);
		}
		TakesScreenshot screen=(TakesScreenshot)driver;
		File sourcefile=screen.getScreenshotAs(OutputType.FILE);
		File dstFile=new File("./Screen Shots/"+screenShotSubFolderName+"/fileName.png");
		Files.copy(sourcefile, dstFile);
	}
}
