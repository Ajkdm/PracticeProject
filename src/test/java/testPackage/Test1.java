package testPackage;

public class Test1
{
	public static void main(String[] args) 
	{
		A a=new A();
		a.m1("Welcome");
	}
	
	
}

class A
{
	public void m1(String str) 
	{
		System.out.println(str);
	}
	
	public void m1(StringBuffer sb) 
	{
		System.out.println(sb);
	}
	
	{
		System.out.println("Hi");
	}
}

