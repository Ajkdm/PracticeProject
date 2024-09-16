package collectionsAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

public class AddTwoLists 
{
	public static void main(String[] args)
	{
		
		addTwoListObjectsUsingAddAll();
		addTwoListObjectsUsingUnion();
		
	}
	
	public static void addTwoListObjectsUsingAddAll() 
	{
		ArrayList list1=new ArrayList();
		list1.add("Apple");
		list1.add("Banana");
		
		ArrayList list2=new ArrayList(Arrays.asList("Pomogranate","Grapes"));
		
		
		list1.addAll(list2);
		
		System.out.println(list1);
	}
	
	public static void addTwoListObjectsUsingUnion() 
	{
		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("A");
		list1.add("B");
		
		ArrayList<String> list2=new ArrayList<>(Arrays.asList("C","D"));
		
		List<String> list3=ListUtils.union(list1,list2);
		
		
		System.out.println(list3);
	}
}
