package javaStarPrograms;

public class Star5 
{
	public static void main(String[] args)
	{
		m1();
	}
	
	public static void m1() 
	{
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i*2-1;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


/*
 	   * 
 	   *** 
 	   *****
 	   *******
 */