package testNG2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcel_VariableIndexedSize
{@Test
	public void method1() throws Exception 
{
	XSSFWorkbook workbook=new XSSFWorkbook("./TestData/File1.xlsx");
	XSSFSheet sheet = workbook.getSheet("Sheet1");

	int rowSize=sheet.getLastRowNum();
	System.out.println(rowSize);
	for(int i=0;i<=rowSize;i++) 
	{
		int lastCell=sheet.getRow(i).getLastCellNum();
		//System.out.println("lastRow - "+rowSize);
		//System.out.println("lastCell - "+lastCell);

		for(int j=0;j<lastCell;j++) 
		{
			
			System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
		}
		System.out.println();
	}
}
}
