package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v124.performance.Performance;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethods 
{
	WebDriver driver;
public void actionClassMethods() 
	{
	WebElement element = driver.findElement(By.className(""));
	
	Actions actions=new Actions(driver);
	
	actions.sendKeys(Keys.END); //PageDown.
	actions.clickAndHold(element).moveToElement(element).release().perform(); //Drag and drop.
	actions.dragAndDrop(element, element).perform(); //Drag and drop.
	actions.moveToElement(element).perform(); //Mouse hover action.
	actions.contextClick(element).perform();  //Right click on a element.
	actions.doubleClick(element).perform();   //Double click on a element.
	
	
	
	}
}
