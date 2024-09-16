package javaAnalyticalPrograms;

public class FindBiggestNumberinGivenArray 
{
	public static void main(String[] args) 
	{
		Integer[] arr= {12,15,23,47,88,12,23,12,18,23,12};
 
		int max=arr[0];
		for(int i=1;i<arr.length;i++) 
		{
			
				if(arr[i]>max) 
				{
					max=arr[i];
				}
			
		}
		System.out.println("Biggest Number is "+max);
	}
}
