package testNG;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadAndWriteFromExcel 
{
	@Test
	public void method1() throws Exception 
	{
		FileInputStream file=new FileInputStream("./TestData/Example1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet2");
		
		DataFormatter formatter=new DataFormatter();
		String email = formatter.formatCellValue(sheet.getRow(1).getCell(0));
		String password=formatter.formatCellValue(sheet.getRow(1).getCell(1));
		
		System.out.println(email+","+password);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		String title = driver.getTitle();
		FileOutputStream output=new FileOutputStream("./TestData/Example1.xlsx");
		sheet=workbook.getSheet("Sheet4");
		
	}
}
