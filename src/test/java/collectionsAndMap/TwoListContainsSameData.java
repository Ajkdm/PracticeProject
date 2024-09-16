package collectionsAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TwoListContainsSameData 
{
	public static void main(String[] args) 
	{
		bothListContainsSameData();
		
		oneOfListContainsSameData();
	}
	
	public static void bothListContainsSameData() 
	{
		ArrayList list1=new ArrayList(Arrays.asList(1,5,2,4,3));
		Collections.sort(list1);
		
		ArrayList list2=new ArrayList(Arrays.asList(5,4,3,2,1));
		Collections.sort(list2);
		
		if(list1.equals(list2)) 
		{
			System.out.println("Both has same data");
		}
		
		else 
		{
			System.out.println("Both has different data");
		}
	}
	
	public static void oneOfListContainsSameData() 
	{
	
		ArrayList<Integer> list1=new ArrayList(Arrays.asList(1,2,3,4,5,6));
		//Collections.sort(list1);
		
		ArrayList list2=new ArrayList(Arrays.asList(5,4,3,2,1,9));
		//Collections.sort(list2);
		
		if(list1.containsAll(list2)) 
		{
			System.out.println("list1 contains all data of list2");
		}
		
		else if(list2.containsAll(list1)) 
		{
			System.out.println("list2 contains all data of list1");
		}
		else 
		{
			System.out.println("Both contains different data");
		}
	}
}
