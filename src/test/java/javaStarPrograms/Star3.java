package javaStarPrograms;

public class Star3 
{
	public static void main(String[] args) 
	{
		m1();
	}
	
	public static void m1() 
	{

		for(int i=1;i<=5;i++) 
		{
			for(int j=5;j>i;j--) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}

			/*			     *
						    **
						   ***
						  ****
						 *****
			
			*/