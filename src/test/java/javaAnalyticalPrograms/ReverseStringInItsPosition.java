package javaAnalyticalPrograms;

import java.util.Arrays;

public class ReverseStringInItsPosition 
{
	public static void main(String[] args)
	{
		 m2();
	}
	
	public static void m1() 
	{
		String str="abc def hij klm";
		String[] words = str.split(" ");
		String tempString;

		String finaReverse="";
		String rev = "";
		System.out.println(Arrays.toString(words));

		for(int i=0;i<words.length;i++) 
		{
			tempString=words[i];
			for(int j=0;j<tempString.length();j++) 
			{
				rev=tempString.charAt(j)+rev;
			}

			System.out.print(rev+" ");
			finaReverse=finaReverse+" "+rev;
			rev="";

		}
		System.out.println();
		System.out.print(finaReverse.trim());
		System.out.println();

		System.out.println("------------------------");
	}
	
	public static void m2() 
	{
		String str="abc xyz";
		
		String[] str2=str.split(" ");
		
		String rev="";
		
		for(String word:str2) 
		{
			char[] ch = word.toCharArray();
			int left=0;
			int right=ch.length-1;
			
			while(left<right) 
			{
				char temp=ch[left];
				ch[left]=ch[right];
				ch[right]=temp;
				
				left++;
				right--;
			}
			
			rev=rev+new String(ch)+" ";
		}
		System.out.println(rev);
	}

}
