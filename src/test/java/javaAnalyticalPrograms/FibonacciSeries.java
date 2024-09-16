package javaAnalyticalPrograms;

public class FibonacciSeries
{
	public static void main(String[] args)
	{
		m2();
	}
	
	public static void m1() 
	{
		int num1=0;
		int num2=1;
		int num3=0;
		System.out.print(num2+",");
		for(int i=1;i<=10;i++) 
		{
			num3=num1+num2;
			System.out.print(num3+",");
			num1=num2;
			num2=num3;
		}
	}
	
	public static void m2() 
	{
		int num1=0;
		int num2=1;
	
		System.out.print(num1+","+num2);
		for(int i=1;i<=10;i++) 
		{
			num2=num1+num2;
			System.out.print(","+num2);
			num1=num2-num1;
			
		}
	}
}

// 1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,
//  0 1 1 2 3 5  8  14 21 34  55




