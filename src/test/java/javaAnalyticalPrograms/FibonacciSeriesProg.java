package javaAnalyticalPrograms;

public class FibonacciSeriesProg 
{
	public static void main(String[] args)
	{
		int num1=0, num2=1;
		
		System.out.print("FS "+num1+","+num2);
		
		for(int i=2;i<=10;i++) 
		{
			int num3=num1+num2;
			System.out.print(","+num3);
			
			num1=num2;
			num2=num3;
		}
		
		
		m1();
		//0,1,1,2,3,5,8,13,21,34,55
		//0,1,2,3,4,5,6,07,08,09,10
	}
	
	public static void m1() 
	{
		for (int i = 0; i < 10; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public static int fib(int ab) {
        if (ab <= 1) {
            return ab;
        } else {
            return fib(ab - 1) + fib(ab - 2);
        }
    

	}
}
