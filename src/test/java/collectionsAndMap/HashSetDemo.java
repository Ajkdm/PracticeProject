package collectionsAndMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo
{
	public static void main(String[] args)
	{
		//Declaration 
		HashSet set=new HashSet();
		//Set set=new HashSet();
		//HashSet<String> set=new HashSet<String>();
		
		//Add Elements
		set.add(100);
		set.add(10.50);
		set.add(true);
		set.add("Hello");
		set.add(100);
		set.add('A');
		set.add(100);
		set.add(null);
		set.add(null);
		
		//Get size
		System.out.println(set.size());//6
		
		//Print all elements
		System.out.println(set);//[null, A, 100, Hello, 10.5, true]
		
		//remove specific element
		set.remove("Hello");
		
		System.out.println(set); //[null, A, 100, 10.5, true]
		
		//get Specific element
		ArrayList al=new ArrayList(set);
		System.out.println(al.get(3)); //10.5
		
		//Read all element
		//Using for each loop
		for(Object x:set) 
		{
			System.out.print(x+", ");// null, A, 100, 10.5, true,
		}
		System.out.println();
		
		//Using iterator
		Iterator<Object> it=set.iterator();
		while(it.hasNext()) 
		{
			System.out.print(it.next()+", ");// null, A, 100, 10.5, true, 
		}
		System.out.println();
		
		//Remove all elements 
		set.clear();
		System.out.println(set);//[]
		
		//check is empty
		System.out.println(set.isEmpty());
	}
}
