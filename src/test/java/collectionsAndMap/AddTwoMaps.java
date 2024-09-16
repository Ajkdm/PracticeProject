package collectionsAndMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.commons.collections4.ListUtils;

public class AddTwoMaps 
{
	public static void main(String[] args)
	{
		addTwoMapsUsinPutAll();
		
		addTwoMapsUsingTreeMap();
		
		addTwoMapsUsingLinkedHashMap();
	}
	
	public static void addTwoMapsUsinPutAll() 
	{
		Map<Integer,String> map1=new HashMap<>();
		
		map1.put(101, "A");
		map1.put(102, "B");
		
		HashMap map2=new HashMap() {{put(102,"C");put(104,"D");}};
		HashMap map3=new HashMap();
		map3.putAll(map1);
		map3.putAll(map2);
		
		System.out.println(map3);
		
	
		//System.out.println(map1);
	}
	
	public static void addTwoMapsUsingTreeMap() 
	{
		SortedMap<Integer,String> map1=new TreeMap<>();
		
		map1.put(101, "A");
		map1.put(102, "B");
		
		SortedMap map2=new TreeMap() {{put(102,"C");put(104,"D");}};
		TreeMap map3=new TreeMap();
		map3.putAll(map1);
		map3.putAll(map2);
		
		System.out.println(map3);
		
	
		//System.out.println(map1);
	}
	
	public static void addTwoMapsUsingLinkedHashMap() 
	{
		LinkedHashMap<Integer,String> map1=new LinkedHashMap<>();
		
		map1.put(101, "A");
		map1.put(102, "B");
		
		LinkedHashMap map2=new LinkedHashMap() {{put(102,"C");put(104,"D");}};
		LinkedHashMap map3=new LinkedHashMap();
		map3.putAll(map1);
		map3.putAll(map2);
		
		System.out.println(map3);
		
	
		//System.out.println(map1);
	}
	
	
}
