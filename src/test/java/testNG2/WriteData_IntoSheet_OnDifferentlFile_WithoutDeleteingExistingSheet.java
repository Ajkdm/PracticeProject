package testNG2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WriteData_IntoSheet_OnDifferentlFile_WithoutDeleteingExistingSheet
{
	@Test
	public void method2() throws Exception 
	{

		String filePath="./TestData/File1.xlsx"; 
		XSSFWorkbook workbook=new XSSFWorkbook(filePath);

		XSSFSheet sheet = workbook.getSheet("Sheet2");

		DataFormatter data=new DataFormatter();

		String email = data.formatCellValue(sheet.getRow(1).getCell(0)); 
		String password = data.formatCellValue(sheet.getRow(1).getCell(1));


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);

		//Write into excel file on different excel file

		String outputFile="./TestData/Example4.xlsx";
		FileInputStream file2=new FileInputStream(outputFile);
		XSSFWorkbook workbook2=new XSSFWorkbook(file2);
		XSSFSheet sheet2 = workbook2.getSheet("Sheet2");

		XSSFCell cell = sheet2.createRow(0).createCell(0);

		cell.setCellValue(driver.getTitle());

		FileOutputStream output=new FileOutputStream(outputFile);
		workbook2.write(output);
	}

}
