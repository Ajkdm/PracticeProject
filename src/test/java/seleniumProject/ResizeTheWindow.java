package seleniumProject;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ResizeTheWindow 
{
	WebDriver driver;
	@Test
	public void resizeWindow() throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Dimension d=new Dimension(400,600);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.resizeTo(400, 600)");
		//js.executeScript("window.innerWidth = arguments[0]; window.innerHeight = arguments[1];", 400, 600);
	}

}
