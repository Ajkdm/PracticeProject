package seleniumAnalyticalCodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class PrintAllValueFromSelectDropDown
{
	public void m1() 
	{
		WebDriver driver=new ChromeDriver();
		WebElement dropDownElement = driver.findElement(By.id("id"));
		
		Select select=new Select(dropDownElement);
		
		List<WebElement> allOptions = select.getOptions();
		for(WebElement option:allOptions) 
		{
			System.out.println(option.getText());
		}
		
	}
}
