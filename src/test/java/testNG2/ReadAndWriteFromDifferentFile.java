package testNG2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadAndWriteFromDifferentFile 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream file1=new FileInputStream("./TestData/Example3.xlsx");
		
		XSSFWorkbook workbook1=new XSSFWorkbook(file1);
		XSSFSheet sheet1 = workbook1.getSheet("Sheet1");
		
		DataFormatter formatter=new DataFormatter();
		String email = formatter.formatCellValue(sheet1.getRow(1).getCell(0));
		String password=formatter.formatCellValue(sheet1.getRow(1).getCell(1));
		
		System.out.println(email+"  "+password);
		
		String[] str= {email,password};
		
		XSSFSheet sheet2 = workbook1.createSheet("Sheet2");
		
		for(int i=0;i<=1;i++) 
		{
			XSSFRow row1 = sheet2.getRow(4);
			XSSFCell cell1 = row1.createCell(i);
			cell1.setCellValue(str[i]);
		}		
		 
		 FileOutputStream output=new FileOutputStream("./TestData/Example3.xlsx");
		 workbook1.write(output);
		
		
	}
}
