package collectionsAndMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		//Declarations
		ArrayList myList=new ArrayList();
		//List myList=new ArrayList();
		//ArrayList<String> myList=new ArrayList<String>();

		//Adding Values
		myList.add("Welcome");
		myList.add(100);
		myList.add(10.5);
		myList.add('A');
		myList.add(null);
		myList.add(100);
		myList.add(null);
		myList.add(true);

		System.out.println(myList.get(1));
		//Print all elements
		System.out.println(myList); //[Welcome, 100, 10.5, A, null, 100, null, true]

		//Remove an element
		myList.remove(2);

		System.out.println(myList); //[Welcome, 100, A, null, 100, null, true]

		//Insert an element 
		myList.set(3, "java");

		System.out.println(myList);// [Welcome, 100, A, java, 100, null, true]

		//Update/replace/change an element
		myList.add(2, "Selenium");

		System.out.println(myList);//[Welcome, 100, Selenium, A, java, 100, null, true]

		//Find the size
		System.out.println(myList.size()); //8

		//Access specific element from the ArrayList
		System.out.println(myList.get(5)); //100

		//Read all element
		//Using for loop

		for(int i=0;i<myList.size();i++) 
		{
			System.out.print(myList.get(i)+", ");//Welcome, 100, Selenium, A, java, 100, null, true, 

		}
		System.out.println();

		//Using for each loop
		for(Object x:myList) 
		{
			System.out.print(x+", ");//Welcome, 100, Selenium, A, java, 100, null, true, 

		}
		System.out.println();

		//Using Itarator

		Iterator it=myList.iterator();
		while(it.hasNext()) 
		{
			System.out.print(it.next()+", ");//Welcome, 100, Selenium, A, java, 100, null, true, 
		}
		System.out.println();
		
		//Checcking isEmpty
		
		System.out.println(myList.isEmpty()); //false
		
		//Remove specif element more than one at once
		ArrayList myList2=new ArrayList();
		myList2.add(100);
		myList2.add("Welcome");
		
		myList.removeAll(myList2);
		System.out.println(myList);//[Selenium, A, java, null, true]
		
		//Remove all elements
		myList.clear();
		System.out.println(myList);//[]
;	}
}
