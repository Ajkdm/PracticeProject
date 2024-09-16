package javaAnalyticalPrograms;

public class FindGivenNumIsPrime 
{
	public static void main(String[] args)
	{
		int n=2;
		/*
		 * if (isPrime(n)) { System.out.println(n + " is a prime number"); } else {
		 * System.out.println(n + " is not a prime number"); }
		 * System.out.println(Math.sqrt(n));
		 */

		System.out.println("---------------------------------");
		//isPrime2(n);
		m4(2);
	}


	public static boolean isPrime(int n) 
	{
		if(n<=1) 
		{
			return false;
		}

		for(int i=2;i<n;i++) 
		{
			if(n%i==0) 
			{
				return false;
			}
		}
		return true;
	}

	public static void isPrime2(int n) 
	{
		int flag=0;
		if(n<=1) 
		{
			System.out.println("Given num is not Prime");
		}
		else {
			for(int i=2;i<=n/2;i++) 
			{
				if(n%i==0) 
				{
					System.out.println("Given num is not Prime");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Given num is Prime");
			}}
	}

	public static void m3(int num) 
	{
		int flag=0;

		if(num<=1) 
		{
			System.out.println("Given num is not Prime");
		}
		else 
		{
			for(int i=2;i<num;i++) 
			{
				if(num%i==0) 
				{
					System.out.println("Given num is not Prime");
					flag=1;
					break;
				}
			}

			if(flag==0) 
			{
				System.out.println("Given num is Prime");
			}
		}
	}

	public static void m4(int num) 
	{
		int flag=0;

		if(num<=1) 
		{
			System.out.println("Given number is not prime");
		}

		else 
		{
			for(int i=2;i<num;i++) 
			{
				if(num%i==0) 
				{
					System.out.println("Given number is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0) 
			{
				System.out.println("Given number is prime");
			}
		}
		
		
	}
}
