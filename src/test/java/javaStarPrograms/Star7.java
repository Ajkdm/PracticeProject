package javaStarPrograms;

public class Star7 
{
	public static void main(String[] args)
	{
		m1();
	}
	
	public static void m1() 
	{
		for(int i=1;i<=5;i++) 
		{
			for(int j=9;j>=i*2-1;j--) 
			{
				System.out.print("*");
			}System.out.println();
		}
	}
}


/*

*********
*******
*****
***
*

*/