package javaAnalyticalPrograms;

import java.util.Arrays;

public class AscendingOrder
{
	public static void main(String[] args)
	{
		Integer[] arr= {12,15,23,47,88,12,23,12,18,23,12};
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j]) 
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
