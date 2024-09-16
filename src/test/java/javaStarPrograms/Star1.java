package javaStarPrograms;

public class Star1 
{
	public static void main(String[] args) 
	{
	m1();
	
	}
	
	public static void m1() 
	{
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	} 
}


			/*	*
				**
				***
				****
				*****	*/