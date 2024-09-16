package arrayBasedPrograms;

import java.util.Arrays;

public class Compare2ArraysContainsSameData
{
	public static void main(String[] args)
	{
		//usingArraysEqualsMethod();
		
		usingContentAndLengthComparison();
	}
	
	public static void usingArraysEqualsMethod() 
	{
		Integer[] arr1={1,4,3,2,5};
		Integer[] arr2={5,2,3,1,4,6};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		if(Arrays.equals(arr1, arr2)) 
		{
			System.out.println("both has same data");
		}
		else 
		{
			System.out.println("Both has different data");
		}
	}
	
	public static void usingContentAndLengthComparison() 
	{
		Integer[] arr1={1,4,3,2,5,8};
		Integer[] arr2={5,2,3,1,4,9};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		if(arr1.length==arr2.length) 
		{
			for(int i=0;i<arr1.length;i++) 
			{
				if(arr1[i]==arr2[i]) 
				{
					if(i==arr1.length-1)
					{
						System.out.println("Both has same data");
					}
				}
				
				else 
				{
					System.out.println("Both has different data");
				}
			}
		}
		
		else 
		{
			System.out.println("Both has different data");
		}
	}
}
