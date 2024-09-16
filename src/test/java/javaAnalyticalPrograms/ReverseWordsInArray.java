package javaAnalyticalPrograms;

import java.util.Arrays;

public class ReverseWordsInArray 
{
	public static void main(String[] args)
	{
		usingWhileLoop();
		usingforLoop();
		m1();
	}
	
	public static void usingWhileLoop() 
	{
		String[] arr= {"Hello", "World", "Java","New","Program"};
		
		String temp;
		int left=0;
		int right=arr.length-1;
		
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
	
	public static void usingforLoop() 
	{
		String[] arr= {"Hello", "World", "Java","New","Program"};
		
		int right=arr.length-1;
		int left=0;
		String temp;
		
		for(int i=right;i>=right/2;i--) 
		{
			if(left<i) {
			temp=arr[left];
			arr[left]=arr[i];
			arr[i]=temp;
			left++;
		}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void m1() 
	{
		String[] str= {"Hello","World","Java","Selenium"};
		
		String temp;
		
		int right=str.length-1;
		
		int left=0;
		
		while(left<right) 
		{
			temp=str[left];
			str[left]=str[right];
			str[right]=temp;
			right--;
			left++;
			
		}
		System.out.println(Arrays.toString(str));
	}
}
