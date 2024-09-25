package javaAnalyticalPrograms;

import java.util.Arrays;

public class FindDuplicatesInAnArray
{
	public static void main(String[] args) 
	{
		Integer[] arr= {12,15,23,47,88,12,88,23,12,18,23,12,99};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
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

		int temp=0;
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
					if(arr[i]==arr[j] && temp!=arr[j]) 
					{
						System.out.print(arr[j]+",");
					}
				
				
			}
			temp=arr[i];
		}
		System.out.println();
		m1();
	}
	
	public static void m1() 
	{
		Integer[] nums={1,4,3,5,2,3,7,9,3,4,2};
		
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		int temp=0;
		
		for(int i=0;i<nums.length;i++) 
		{
			for(int j=i+1;j<nums.length;j++) 
			{
				if(temp!=nums[j]) 
				{
					if(nums[i]==nums[j]) 
					{
						System.out.print(nums[j]+" ");
					}
				}
			}
			temp=nums[i];
		}
	}
}
