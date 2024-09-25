package arrayBasedPrograms;

import java.util.Arrays;

public class CopyAnArray 
{
	public static void main(String[] args)
	{
		Integer[] arr= {1,2,3,4,5,6,7};
		Integer[] arr2=arr;
		Integer[] arr3=Arrays.copyOf(arr,arr.length);
		Integer[] arr4=arr.clone();
		//Integer[] arr5=System.arraycopy(arr, 0, arr5, 0, arr.length);
		
		System.out.println(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr2));
		System.out.println(Arrays.asList(arr3));
		System.out.println(Arrays.asList(arr4));
		
		int[] arr5 = {1, 2, 3, 4, 5};
		String str = Arrays.toString(arr5);
		System.out.println(str); // [1, 2, 3, 4, 5]
	}
}
