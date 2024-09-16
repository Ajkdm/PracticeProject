package javaAnalyticalPrograms;

import java.util.Arrays;

public class SortString
{
	public static void main(String[] args) 
	{
		String str="ajaykadam";
		
		char[] str2 = str.toCharArray();
		
		Arrays.sort(str2);
		
		String sortedStr=new String(str2);
		System.out.println(sortedStr);
		
		m1();
		
	}
	
	public static void m1() 
	{
		String str="AZajaykadam";
		char temp=0;
		String sorted="";
		char[] str2 = str.toCharArray();
		
		for(int i=0;i<str2.length;i++) 
		{
			for(int j=0;j<str2.length;j++) 
			{
				if(str2[i]<=str2[j]) 
				{
					temp=str2[i];
					str2[i]=str2[j];
					str2[j]=temp;
				}
			}
			
			
		}
		sorted=new String(str2);
	//	String sortedStr=new String(str2);
		System.out.println(sorted);
		
	}
}
