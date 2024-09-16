package javaAnalyticalPrograms;

public class PrintRangeOfPrimeNumbers
{
	public static void main(String[] args) 
	{
		for(int i=2;i<=25;i++) 
		{
			if(i==2) 
			{
				System.out.print(i+" ");
			}
			
			else
			{
				for(int j=2;j<i;j++) 
				{
					if(i%j==0) 
					{
						break;
					}
					else 
					{
						if(j==i-1) 
						{
							System.out.print(i+" ");
						}
					}
				}
			}
		}
	}
}
