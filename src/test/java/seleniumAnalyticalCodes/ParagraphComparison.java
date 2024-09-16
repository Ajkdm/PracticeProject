package seleniumAnalyticalCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParagraphComparison 
{
	@Test
	public void method1() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("");
		String paragraph = driver.findElement(By.id("")).getText();
		String expectedParagraph="paragraph";
		
		if(paragraph.equals(expectedParagraph)) 
		{
			System.out.println("ParagraphMatched");
		}
	}
}
