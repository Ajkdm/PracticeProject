package arrayBasedPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesInAnArrayUsingCollection
{
	public static void main(String[] args) 
	{
		removeDuplicatesUsingSet();
		removeDuplicatesUsingList();
	}
	
	//Remove duplicates Using Set
	public static void removeDuplicatesUsingSet() 
	{
		Integer[] num1= {1,2,2,3,4,4,5,6,6,7};
		HashSet<Integer> num2= new HashSet<>(Arrays.asList(num1));
		
		System.out.println(num2);
	}
	
	//Remove duplicates Using List
	public static void removeDuplicatesUsingList() 
	{
		Integer[] num1={1,2,2,3,4,4,5,6,6,7,8,8,8,9,9};
		
		ArrayList num2=new ArrayList();
		
		for(Integer x:num1) 
		{
			if(!num2.contains(x)) 
			{
				num2.add(x);
			}
		}
		
		System.out.println(num2);
	}
}
