package javaAnalyticalPrograms;

import java.util.Arrays;

public class REverse 
{
	public static void main(String[] args)
	{
		String[] arr= {"abcd","efgh","ijkl"};
		int right=arr.length-1;
		int left=0;
		
		String temp;
		
		
			while(left<right) 
			{
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				
				left++;
				right--;
			}
		
		System.out.println(Arrays.toString(arr));
	}
}
