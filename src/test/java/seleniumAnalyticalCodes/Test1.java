package seleniumAnalyticalCodes;


import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.util.Exceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Test1
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		XSSFWorkbook book=new XSSFWorkbook("./TestData/File.xlsx");
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
	
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.close();
		Thread.sleep(5000);
		 WebElement element = driver.findElement(By.id("APjFqb"));
		//System.out.println(element.size());
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	//	wait.until(ExpectedConditions.elementToBeClickable(element));
		
		Wait<WebDriver> fluent=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class);
		//fluent.until(ExpectedConditions.elementToBeClickable(element));
		
		TakesScreenshot screen=(TakesScreenshot)driver;
		File sourceFile=screen.getScreenshotAs(OutputType.FILE);
		File dstFile=new File("./ScreenShots/google.png");
		
		Files.copy(sourceFile, dstFile);
		
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.UP);
		actions.sendKeys(Keys.DOWN);
		actions.sendKeys(Keys.END);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ARROW_UP);
		
		Select sel=new Select(element);
		
		sel.selectByIndex(1);
		sel.selectByValue("Value");
		sel.selectByVisibleText("VisibleText");
		
	String parentWindow = driver.getWindowHandle();
	Set<String> allWindows = driver.getWindowHandles();
	for(String win:allWindows) 
	{
		if(win=="Title") 
		{
			driver.switchTo().window(win);
		}
	driver.switchTo().defaultContent();
	}	
	
	driver.manage().window().setSize(new Dimension(1024,768));
		
	js.executeScript("window.resizeTo(1024,768)");
	
	DataFormatter format=new DataFormatter();
	String data = format.formatCellValue(sheet.getRow(1).getCell(0));
		
		
	//*[@id="APjFqb"]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
