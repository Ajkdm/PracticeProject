package seleniumAnalyticalCodes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class WriteDataIntoExcelFile 
{
	@Test
	public void writeIntoNewFile() throws IOException 
	{
		String str="9591453335";
		
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("NewSheet1");
		
		//XSSFCell cell2 = sheet.createRow(0).createCell(0).setCellValue(str);;
		XSSFRow row=sheet.createRow(0);
		XSSFCell cell= row.createCell(0);
		cell.setCellValue(str);
		
		FileOutputStream file=new FileOutputStream("./TestData/Example6.xlsx");
		book.write(file);
		
	}
	
	@Test
	public void writeIntoExistingFileNewSheet() throws IOException 
	{
		
		List<String> str=new ArrayList<>();
		str.add("abc");
		str.add("TestUser");
		str.add("123");
		
		int n=0;
		FileInputStream file1=new FileInputStream("./TestData/Example6.xlsx"); 
		XSSFWorkbook book=new XSSFWorkbook(file1);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		XSSFRow row=sheet.createRow(0);
		
		for(int i=0;i<str.size();i++) 
		{
		
		XSSFCell cell= row.createCell(n);
		cell.setCellValue(str.get(i));
		n++;
		}
		
		FileOutputStream file=new FileOutputStream("./TestData/Example6.xlsx");
		book.write(file);
		
	}
}
