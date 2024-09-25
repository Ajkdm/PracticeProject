package javaStarPrograms;

public class Star10 {

	public static void main(String[] args)
	{
		m1();
	}
	
	public static void m1() 
	{
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++) 
			{
				if(i==1 || i==5 || j==1 || j==5 ) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}


/*


*****
*	*
*	*
*	*
*****

*/