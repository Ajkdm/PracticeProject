package seleniumProject;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertVerify 
{
	@Test
	public void hardAssert() throws Exception
		{
		SoftAssert softAssert=new SoftAssert();
		String expectedString="123456789";
		String actualString="123456789";
		
		String expectedString2="987654321";
		String actualString2="hgfedcba";
		
		//SoftAssert softAssert=new SoftAssert();
		
		softAssert.assertEquals(actualString, expectedString);
		softAssert.assertEquals(actualString2, expectedString2);
		softAssert.assertAll();
		}
}
