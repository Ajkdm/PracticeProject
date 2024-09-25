package seleniumAnalyticalCodes;

import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;

public class PrintExcelValue
{
	@Test
	public void m1() 
	{
		try {
			XSSFWorkbook book=new XSSFWorkbook("./TestData/Example7.xlsx");
			XSSFSheet sheet = book.getSheet("Sheet1");
			int lastRownum=sheet.getLastRowNum();
			System.out.println(lastRownum);
			DataFormatter format=new DataFormatter();
			for(int i=0;i<=lastRownum;i++) 
			{
				String data=format.formatCellValue(sheet.getRow(i).getCell(0));
				System.out.println(data);
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
