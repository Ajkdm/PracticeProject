package javaAnalyticalPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class CountReapeatedWordsInAnArray
{
	public static void main(String[] args)
	{
		Approach1();
	}
	public static void Approach1() 
	{
		 String str="hello world my world is my world";
	      
	     String[] str2=str.split(" ");
	     Arrays.sort(str2);//[hello, is, my, my, world, world, world]
	     int count=1;
	        
	     String temp="";
	        
	     for(int i=0;i<str2.length;i++)
	       {
	         for(int j=i+1;j<str2.length;j++)
	          {	
	            if(str2[i].equals(str2[j]))
	            {
	              count=count+1;
	            }
	          }
	         if(!temp.equals(str2[i])) 
	          {
	           System.out.println(str2[i]+" is "+count+" times");
	           count=1;
               temp=str2[i];
	          }
	        }    
	}
	
	public static void Approach2() //Using Set fromCollection
	{
		String str="hello world my world is my world";
	    String[] str2=str.split(" ");
	    LinkedHashSet<String> set=new LinkedHashSet<>(Arrays.asList(str2));//[hello, world, my, is]
	   
	    int count=0;
	    for(String s:set) 
	    {
	    	 for(int j=0;j<str2.length;j++) 
	    	 {
	    		 if(s.equals(str2[j])) 
	    		 {
	    			 count++;
	    		 }
	    	 } 
	    	 System.out.println(s+" "+count+" times");
	    	 count=0;
	    } 
	}
}
