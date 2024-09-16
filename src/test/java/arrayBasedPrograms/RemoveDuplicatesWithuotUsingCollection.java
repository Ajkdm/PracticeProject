package arrayBasedPrograms;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;

public class RemoveDuplicatesWithuotUsingCollection 
{
	public static void main(String[] args)
	{	
		System.out.println(m1());
	}
	
	public static boolean m1() 
	{
		Integer[] arr1= {1,5,2,4,3};
		Integer[] arr2= {1,3,2};
		
		ArrayList<Integer> hash1=new ArrayList<Integer>(Arrays.asList(arr1));
		ArrayList<Integer> hash2=new ArrayList<Integer>(Arrays.asList(arr2));
		
		if(hash1.containsAll(hash2)) 
		{
			return true;
		}
		
		return false;
	}
}
