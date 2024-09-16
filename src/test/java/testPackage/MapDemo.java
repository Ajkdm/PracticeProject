package testPackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap<Integer,String>(){{put(101,"abc");put(102,"xyz");put(103,"def");}};
		
		Iterator it=map.entrySet().iterator();
		
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		Iterator<Entry<Integer,String>> it2=map.entrySet().iterator();
		
		while(it2.hasNext()) 
		{
			Entry<Integer,String> entry=it2.next();
			System.out.println(entry.getKey()+entry.getValue());
			
		}
	}
}
