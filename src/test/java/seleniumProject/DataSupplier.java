package seleniumProject;

import org.testng.annotations.DataProvider;

public class DataSupplier
{
@DataProvider
public Object[] dp1() 
	{
	Object[] data=new Object[] {"ABC","def","ghi","jkl"};
	return data;
	
	}

@DataProvider
public Object[] dp2()
{
	Object[] data=new Object[] {"car","bus","train","jeep"};
	return  data;
}
}
