package testNG3;

public class ClassPoly 
{
	public static void main(String[] args)
	{
		A a=new A();
		B b=new B();
		A ab=new B();
		//B ba=new A();
		
		a.m1();
		b.m1();
		b.m2();
		
		ab.m1();
	}
}

class A
{
	public void m1() 
	{
		System.out.println("Class A Methods");
	}
}

class B extends A
{
	public void m2() 
	{
		System.out.println("Class B Methods");
	}
}