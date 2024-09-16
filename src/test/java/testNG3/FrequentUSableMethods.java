package testNG3;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FrequentUSableMethods 
{
	static WebDriver driver;
public static void main(String[] args)
{
		//Set Window Size
		//Dimension d=new Dimension(1024,768);
		//driver.manage().window().setSize(d);
		
		//or
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		long l=12;
		int a=(int)l;
		
		int c=20;
		long b=c;
		
		System.out.println(a);
		
		int num1=14;
		Integer num2=num1;
		
		Integer num3=14;
		
		int num4=num3;
	}
}
