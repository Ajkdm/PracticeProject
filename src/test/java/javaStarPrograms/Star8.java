package javaStarPrograms;

import java.util.Arrays;

public class Star8 
{
	public static void main(String[] args)
	{
		m1();
		String str="abcabc";
		char[] str2 = str.toCharArray();
		Arrays.sort(str2);
		String str3 = new String(str2);
		System.out.println(str3);
	}
	
	public static void m1() 
	{
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<i;j++) 
			{
				System.out.print(" ");
			}
			
			for(int k=9;k>=i*2-1;k--) 
			{
			System.out.print("*");	
			}System.out.println();
		}
	}
}

/*
*********
 *******
  *****
   ***
    *

*/