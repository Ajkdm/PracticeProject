package testNG3;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderUsingExcelSheet
{
	@DataProvider(parallel=true)
	public String[][] getData() throws Exception
	{
		XSSFWorkbook book=new XSSFWorkbook("./TestData/Example5.xlsx");

		XSSFSheet sheet1 = book.getSheet("Sheet1");
		int rows=sheet1.getLastRowNum();
		int columns=sheet1.getRow(1).getLastCellNum();
		System.out.println(rows);
		System.out.println(columns);
		String[][] str=new String[rows][rows];
		for(int i=1;i<=rows;i++) 
		{
			for (int j=0;j<columns;j++)
			{
				DataFormatter format=new DataFormatter();
				str[i-1][j]=format.formatCellValue(sheet1.getRow(i).getCell(j));
			}
		}
		return str;
	}
}
