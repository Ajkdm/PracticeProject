package seleniumAnalyticalCodes;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;


public class ReadDataFromPropertyFile
{
	Properties prop;
	@Test
	public void m1() throws IOException 
	{
		FileReader file=new FileReader("./TestData/StaticData.properties");
		prop=new Properties();
		prop.load(file);
		
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("userName"));
		System.out.println(prop.getProperty("passWord"));
		System.out.println(prop.getProperty("PhoneNum"));
		System.out.println(prop.getProperty("email"));

	}
}
