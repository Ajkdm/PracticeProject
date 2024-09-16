package seleniumAnalyticalCodes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MakMyTrip 
{
	static WebDriver driver;

	public static void main(String[] args) throws Exception
	{
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		driver.findElement(By.id("fromCity")).click();
		
		Thread.sleep(5);
		//List<WebElement> element = driver.findElements(By.xpath("//li[@role='option']//div/p[@class='font14 appendBottom5 blackText']"));
		List<WebElement> element = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
		
		for(WebElement x:element) 
		{
			System.out.println("Text is "+x.getText());
		}
	}

	public static void testCase1() throws Exception 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		Thread.sleep(5);
		//List<WebElement> element = driver.findElements(By.xpath("//li[@role='option']//div/p[@class='font14 appendBottom5 blackText']"));
		List<WebElement> element = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
		
		for(WebElement x:element) 
		{
			System.out.println("Text is "+x.getText());
		}
		
	}
}
