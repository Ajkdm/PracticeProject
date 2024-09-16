package javaLanguage;

public class Overloading 
{
static int add2Num(int a, int b) 
	{
	return a+b;
	}
static int add3Num(int a,int b, int c) 
	{
	return a+b+c;
	}

 int sub2Num(int a, int b) 
{
return a-b;
}
 int sub3Num(int a,int b, int c) 
{
return a-b-c;
}

public static void main(String[] args) 
{
	System.out.println(add2Num(5, 6));
	
	System.out.println(add3Num(3, 4, 5));
	
	Overloading over=new Overloading();
	
	System.out.println(over.sub2Num(10, 5));
	
	System.out.println(over.sub3Num(10, 5, 2));
}
}
