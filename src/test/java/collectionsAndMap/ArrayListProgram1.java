package collectionsAndMap;

import java.util.ArrayList;

public class ArrayListProgram1
{
	public static void main(String[] args) 
	{
		String str="ajaykadam";
		int count=1;
		for(int i=0;i<str.length();i++) 
		{
			for(int j=i+1;j<str.length();j++) 
			{
				if(str.charAt(i)==str.charAt(j)) 
				{
					count++;
				}
			}
			
		}
		System.out.println(count);
	}
}
