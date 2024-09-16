package javaAnalyticalPrograms;

public class DifferenceBetweenEquals 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");

		System.out.println(s1 == s2);  // true (same reference in SCP)
		System.out.println(s1 == s3);  // false (different references)
		System.out.println(s1.equals(s3));  // true (value equality)
		
	}
}
