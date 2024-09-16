package seleniumAnalyticalCodes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class SomeSeleniumImportantMethods
{
	WebDriver driver;
	public void method1() throws Exception 
	{
		//Scroll Down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.END);
		
		WebElement element = driver.findElement(By.id("element"));
		element.getLocation();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		//Mouse Hover
		
		actions.moveToElement(element).perform();
		
		//Drag And Drop
		
		actions.dragAndDrop(element, element);
		
		actions.clickAndHold(element).moveToElement(element).release().perform();
		
		//Right Click
		actions.contextClick(element);
		
		//Drop Down
		
		Select select1=new Select(element);
		select1.selectByVisibleText("Visible Test");
		
		Select select2=new Select(element);
		select2.selectByIndex(1);
		
		Select select3=new Select(element);
		select3.selectByValue("value");
		
		//Switch To
		driver.switchTo().activeElement().sendKeys("abcdef");
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("String");
		
		driver.switchTo().frame(element);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().window("window handled string");
		
		// Set Browser Size
		driver.manage().window().maximize();
		
		//Set Customized size
		Dimension d=new Dimension(1024, 720);
		
		driver.manage().window().setSize(d);
		
		js.executeScript("window.resizeTo(1024,768)");
		
		//Fluent wait
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		
		
	}
}
