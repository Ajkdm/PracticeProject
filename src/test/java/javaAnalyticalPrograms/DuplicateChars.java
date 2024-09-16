package javaAnalyticalPrograms;

import java.util.Arrays;

public class DuplicateChars
{
	public static void main(String[] args)
	{
		m1();
	}
	public static void m1() 
	{
		String str="google";
		
	     int count=1;
	     char dup=0;
	     char[] ch=str.toCharArray();
	     Arrays.sort(ch);
	   
	     for(int i=0;i<ch.length;i++)
	     {
	         for(int j=i+1;j<ch.length;j++)
	         {
	        	 if(ch[i]==ch[j])
	        	 {
	             count++;
	        	 }
	         }
	         if(count>1)
	         {
	        	 dup=ch[i];
	        	 System.out.println("duplicate char is :- " +dup+" repeated "+count +" times");
	             
	         }
	         count=1;
	     }
	     
	     
	}
}
