package javaAnalyticalPrograms;

import java.util.Arrays;

public class MaximumOccuranceOfCharInString
{
	public static void main(String[] args) 
	{
		String str="ajaykadammmmmkakkkakk";

		char[] str2=str.toCharArray();

		Arrays.sort(str2);
		System.out.println(str2);

		int max1=0;
		int max2=1;
		char maxChar = 0;

		for(int i=0;i<str2.length;i++) 
		{
			for(int j=i+1;j<str2.length;j++) 
			{
				if(str2[i]==str2[j]) 
				{
					max2++;
				}
			}
			if(max2>max1) 
			{
				max1=max2;
				maxChar=str2[i];
			}
			max2=1;
		}

		System.out.println("Maximum Occured char is "+maxChar+", "+ max1+" times it occured");
		m1();
	}

	public static void m1() 
	{
		String str3="googleee";
		
		char[] str4=str3.toCharArray();
		
		Arrays.sort(str4);
		
		System.out.println(str4);
		
		int max1=0;
		int max2=1;
		
		char maxChar1=0;
		
		for(int i=0;i<str4.length;i++) 
		{
			for(int j=i+1;j<str4.length;j++) 
			{
				if(str4[i]==str4[j]) 
				{
					max2++;
				}
			}
			if(max2>max1) 
			{
				max1=max2;
			}
			max2=1;
		}
		
		System.out.println(maxChar1+" "+max1);
		
		
		
		
	}
	
	
}
