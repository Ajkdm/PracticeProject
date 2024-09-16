package javaStarPrograms;

public class Star4
{
	public static void main(String[] args)
	{
		m1();
	}
	
	public static void m1() 
	{
		for(int i=1;i<=5;i++) 
		{
			for(int j=2;j<=i;j++) 
			{
				System.out.print(" ");
			}
			
			for(int k=5;k>=i;k--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

				/*	
					 *****
					  ****
					   ***
					    **
					     *	*/