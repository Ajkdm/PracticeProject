package testNG2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Write_TitleofThePage_IntoExcelSheet_OnSameExcelFile 
{
	@Test
	public void method1() throws Exception 
	{
		String filePath = "./TestData/File1.xlsx";
		FileInputStream inputfile=new FileInputStream(filePath);
		XSSFWorkbook workbook2=new XSSFWorkbook(inputfile);
		
		XSSFSheet sheet2 = workbook2.getSheet("Sheet2");
		
		DataFormatter dat=new DataFormatter();
		
		String email = dat.formatCellValue(sheet2.getRow(1).getCell(0));
		String password = dat.formatCellValue(sheet2.getRow(1).getCell(1));
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		
		//Write in same file on different sheet
		
		XSSFSheet sheet3 = workbook2.getSheet("Sheet3");
		XSSFRow row = sheet3.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue(driver.getTitle());
		FileOutputStream file=new FileOutputStream(filePath);
		workbook2.write(file);
		workbook2.close();
		
	}
}
