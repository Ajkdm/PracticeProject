package seleniumProject;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ExcellData 
{
	WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook wb=new XSSFWorkbook("./TestData/Example1.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		//      or
		XSSFSheet sheet1 = wb.getSheet("Sheet1");
	
		
		int lastRow=sheet.getLastRowNum();
		//            or
		int totalRows=sheet.getPhysicalNumberOfRows();
		
		System.out.println("Last Row number is "+lastRow);
		
		for(int i=1;i<=lastRow;i++) {
		String username = sheet.getRow(i).getCell(1).getStringCellValue();
	    //	        or
		String username2=sheet.getRow(i).getCell(1).toString();
		
		
		String password = sheet.getRow(i).getCell(2).toString();
		//        or
		//double password2 = sheet.getRow(i).getCell(2).getNumericCellValue();
		
		System.out.print(i+")"+" "+username+" ");
		System.out.println(password);
		
		System.out.println();
		}
	
	}
	
	public void m1() 
	{}
}
