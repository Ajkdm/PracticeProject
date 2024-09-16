package collectionsAndMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo
{
	public static void main(String[] args) 
	{
		//Declaration
		//HashMap map=new HashMap();
		//Map map=new HashMap();
		
		HashMap<Integer,String> map=new HashMap<>();
		
		//Adding pairs
		map.put(101, "User1");
		map.put(102,"User2");
		map.put(103,"User3");
		map.put(104,"User4");
		map.put(105,"User5");
		map.put(102,"User6");
		
		//Print all pairs
		System.out.println(map);//{101=User1, 102=User6, 103=User3, 104=User4, 105=User5}

		//size of HashMap
		System.out.println(map.size()); //5
		
		//Remove a pair
		map.remove(103); //{101=User1, 102=User6, 104=User4, 105=User5}
		System.out.println(map);
		
		//Access value of key
		System.out.println(map.get(104)); //User4
		
		//Get all keys
		System.out.println(map.keySet()); //[101, 102, 104, 105]
		
		//Get all values
		System.out.println(map.values()); //[User1, User6, User4, User5]
		
		//Get all keys and values
		System.out.println(map.entrySet());//[101=User1, 102=User6, 104=User4, 105=User5]
		
		//Reading all data
		//Using for each loop
		for(int k:map.keySet())
		{
			System.out.print(k+" "+map.get(k)+", ");//101 User1, 102 User6, 104 User4, 105 User5, 		
		}
		System.out.println();
		System.out.println();
		
		//Using Iterator
		Iterator<Entry<Integer,String>> it = map.entrySet().iterator();
		
		while(it.hasNext()) 
		{
			Entry<Integer,String> entry = it.next();
			//System.out.println(entry.getKey());
			//System.out.println(entry.getValue());
			
			//System.out.println(it.next());\
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//Remove all oairs
		map.clear();
		System.out.println(map);//{}
		
		//Check is empty
		System.out.println(map.isEmpty());// true
		
	}
}
