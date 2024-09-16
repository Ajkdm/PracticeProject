package javaAnalyticalPrograms;

public class ReverseStringWithoutReverseConcept
{
	public static void main(String[] args)
	{
		String str = "Hello";
        String reversedStr = reverse(str);
        System.out.println(reversedStr); // "olleH"
        System.out.println(str);
        
		//m1();

	}
	public static void m1() 
	{
		String str="abcdefgh";
		String rev="";
		int n=0;
		
		if(n<str.length()) 
		{
			rev=str.charAt(n)+rev;
			n++;
			m1();
		}
		
		System.err.println(rev);
	}
	
	//Here's an example of reversing a string using recursive calling:


	    public static String reverse(String str) {
	        if (str.isEmpty())
	            return str;
	        else
	            return reverse(str.substring(1)) + str.charAt(0);
	    }
}
