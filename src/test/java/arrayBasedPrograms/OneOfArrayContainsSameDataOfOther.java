package arrayBasedPrograms;

import java.util.Arrays;

public class OneOfArrayContainsSameDataOfOther
{
	public static void main(String[] args)
	{
		System.out.println(m1());
	}
	
	public static boolean m1() 
	{
		int[] arr1= {1,5,2,4,3};
		int[] arr2= {1,3,2};
		
		Arrays.sort(arr1);//1,2,3,4,5
		Arrays.sort(arr2);//1,2,3
		boolean flag=false;
		for(int i=0;i<arr2.length;i++) 
		{
			for(int j=0;j<arr1.length;j++) 
			{
				if(arr2[i]==arr1[j]) 
				{
					if(i==arr2.length) 
					{
						flag=true;	
					}
					
				}
				else
				{
					flag=false;
				//	break;
				}
			}
		}
		
		return flag;
		
	} 
}
