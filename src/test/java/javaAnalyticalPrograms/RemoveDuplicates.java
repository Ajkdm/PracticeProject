package javaAnalyticalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates 
{
	public static void main(String[] args)
	{
		Integer[] nums= {1,2,2,3,4,5,5,6,6,7,7};
		
		Set<Integer> num2=new HashSet<>(Arrays.asList(nums));
		
		System.out.println(num2);
		
		List<Integer> list=Arrays.asList(1,1,2,2,3,4,4,5,6,6,7,8,8,9,10,10,11);
		
		Set<Integer> list2=new HashSet<>(list);
		System.out.println(list2);
		
	}
}
