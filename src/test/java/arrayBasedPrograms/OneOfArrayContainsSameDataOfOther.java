package arrayBasedPrograms;

import java.util.Arrays;

public class OneOfArrayContainsSameDataOfOther
{
	public static void main(String[] args)
	{
		m1();
	}
	
	public static void m1() 
	{
		int[] arr1= {1,5,2,4,3};
		int[] arr2= {1,3,2};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<arr2.length;i++) 
		{
			for(int j=0;j<arr1.length;j++) 
			{
				if(arr2[i]==arr1[j]) 
				{
					System.out.println("Hi");
				}
			}
		}
		
		
	} 
}
