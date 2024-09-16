package NewTypeQstn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumOccuranceOfCharInString2Using1Map
{
	public static void main(String[] args) throws Exception 
	{
		String str="ajaykadammmmmkakkkakk";

		char[] str2=str.toCharArray();

		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		Arrays.sort(str2);
		System.out.println(str2);

		int max1=0;
		int max2=1;
		char maxChar = '\0';

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
				map.put(maxChar, max1);
			}
			max2=1;
		}

		System.out.println("Maximum Occured char is "+maxChar+", "+ max1+" times it occured");
		System.out.println(map);
		
	}
}
