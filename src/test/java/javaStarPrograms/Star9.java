package javaStarPrograms;

public class Star9 
{
	public static void main(String[] args)
	{
		m1();
	}
	
	public static void m1() 
	{
		for(int i=1;i<=5;i++) 
		{
			for(int k=5;k>i;k--) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++) 
		{
			for(int k=1;k<=i;k++) 
			{
				System.out.print(" ");
			}
			for(int j=7;j>=i*2-1;j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
