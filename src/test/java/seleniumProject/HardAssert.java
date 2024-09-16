package seleniumProject;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class HardAssert 
{
@Test
public void hardAssert() throws Exception
	{
	String expectedString="123456789";
	String actualString="abcdefghijkl";
	
	String expectedString2="987654321";
	String actualString2="hgfedcba";
	
	assertEquals(actualString, expectedString);
	assertEquals(actualString2, expectedString2);
	
	}

}
