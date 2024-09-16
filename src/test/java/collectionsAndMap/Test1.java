package collectionsAndMap;

public class Test1
{
	public static void main(String[] args) 
	{
		String s=new String("Hello");
		
		String sn = s.concat("World");
		System.out.println(s);
		System.out.println(sn);
		
		StringBuffer sb=new StringBuffer("Welcome");
		sb.append("Home");
		System.out.println(sb);
		
		StringBuilder sr=new StringBuilder("Selenium");
		sr.append("WebDriver");
		System.out.println(sr);
	}
}
