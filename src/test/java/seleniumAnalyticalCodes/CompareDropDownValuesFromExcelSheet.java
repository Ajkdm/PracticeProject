package seleniumAnalyticalCodes;


import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CompareDropDownValuesFromExcelSheet 
{
	@Test
	public void m1()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/select-menu");
		WebElement element = driver.findElement(By.id("oldSelectMenu"));
		Select select=new Select(element);
		List<WebElement> list=select.getOptions();
	
	try 
	{
		XSSFWorkbook book=new XSSFWorkbook("./TestData/Example7.xlsx");
		XSSFSheet sheet = book.getSheet("Sheet1");
		for(int i=0;i<list.size();i++) 
		{
			DataFormatter format=new DataFormatter();
			String data=format.formatCellValue(sheet.getRow(i).getCell(0));
			String data2=list.get(i).getText();
			Assert.assertEquals(data, data2);
			System.out.println(data+"," +data2);
		}	
	}
	
	catch(Exception e) 
	{
		System.out.println("Mentioned file path is not correct");
		e.printStackTrace();
	}
}
}
