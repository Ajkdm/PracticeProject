package collectionsAndMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapWithNullTest 
{
	public static void main(String[] args)
	{
		HashMap<String,String> map=new HashMap<String,String>();
	
		//Adding pairs
		map.put(null, null);
		map.put(null,null);
		map.put(null,"User3");
		map.put(null,"User4");
		map.put(null,"User5");
	//	map.put(102,"User6");
		map.put("abc","User6");
		
		//Print all pairs
		System.out.println(map);

	}
}
