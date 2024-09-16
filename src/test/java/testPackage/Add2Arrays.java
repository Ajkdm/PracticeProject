package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.ArrayUtils;

import com.google.common.collect.Sets;

public class Add2Arrays 
{
public static void main(String[] args) throws Exception
{
	int[] array1 = {1, 2, 3,10,11,12,13};
	int[] array2 = {4, 5, 6,7,8,9};
	int[] combinedArray = new int[array1.length + array2.length];
	
	for(int i=0;i<array1.length;i++) 
	{
		combinedArray[i]=array1[i];
	}
	
	System.out.println(Arrays.toString(combinedArray));
	int n=0;
	for(int i=array1.length;i<combinedArray.length;i++) 
	{
		combinedArray[i]=array2[n];
		n++;
	}
	
	System.out.println(Arrays.toString(combinedArray));
	
	int[] array3 = {1, 2, 3,10,11,12,13};
	int[] array4 = {4, 5, 6,7,8,9};
	
	int[] arry5=ArrayUtils.addAll(array3, array4);
	System.out.println(Arrays.toString(arry5));
	
	List<String> list1=new ArrayList<String>(Arrays.asList("A","B","C","D"));
	
	List<String> list2=new ArrayList<>(Arrays.asList("E","F","G","H"));
	
	System.out.println(list1.addAll(list2));
	System.out.println(list1);
	
	List<String> list3=ListUtils.union(list1, list2);
	
	System.out.println("List 3 -"+list3);
	
Set<String> list4=new HashSet<String>(Arrays.asList("A","B","C","D"));
	
	Set<String> list5=new HashSet<>(Arrays.asList("E","F","G","H"));
	
	Set<String> list6=Sets.union(list4, list5);
	
	System.out.println("Set -"+list6);
	
	list4.addAll(list5);
	System.out.println(list4);
	Thread.sleep(null);

	
	
}
static {}
{}
}
