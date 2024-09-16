package collectionsAndMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class AddTwoSets
{
	public static void main(String[] args) 
	{
		addTwoSetsUsingAddAll();
		
		addTwoSetsUsingAddAllInSortedSet();
	}
	
	public static void addTwoSetsUsingAddAll() 
	{
		HashSet set=new HashSet();
		
		set.add("Apple");
		set.add("Banana");
		set.add("Gauva");
		
		HashSet set2=new HashSet(Arrays.asList("Apple","Grapes","WaterMelon"));
		
		set.addAll(set2);
		
		System.out.println(set);
	}
	
	public static void addTwoSetsUsingAddAllInSortedSet() 
	{
		TreeSet set=new TreeSet();
		
		set.add("Apple");
		set.add("Banana");
		set.add("Gauva");
		
		HashSet set2=new HashSet(Arrays.asList("Apple","Grapes","WaterMelon"));
		
		set.addAll(set2);
		
		System.out.println(set);
	}
	
	public static void addTwoSetsUsingAddAllInLinkedHashSet() 
	{
		LinkedHashSet set=new LinkedHashSet();
		
		set.add("Apple");
		set.add("Banana");
		set.add("Gauva");
		
		HashSet set2=new HashSet(Arrays.asList("Apple","Grapes","WaterMelon"));
		
		set.addAll(set2);
		
		System.out.println(set);
	}
}
