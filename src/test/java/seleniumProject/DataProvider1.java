package seleniumProject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 
{
	@Test(dataProvider="dp1",dataProviderClass = DataSupplier.class)
	public void m1(Object s) 
	{
		System.out.println(s);

	}
	
	
}

