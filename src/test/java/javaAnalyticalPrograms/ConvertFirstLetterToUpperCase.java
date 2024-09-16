package javaAnalyticalPrograms;

public class ConvertFirstLetterToUpperCase
{
	public static void main(String[] args)
	{
		String str="hi, welcome to india";

		String[] str2=str.split(" ");
		
		String newStr="";
		
		for(String word:str2) 
		{
			newStr=newStr+Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
			
		}
		newStr.trim();
		System.out.println(newStr);
	}
}
