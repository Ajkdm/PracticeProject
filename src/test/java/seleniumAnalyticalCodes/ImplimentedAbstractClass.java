package seleniumAnalyticalCodes;

public class ImplimentedAbstractClass extends AbstractClass
{
	@Override
	public void m1() 
	{
		System.out.println("Implimented abstract method");
	}
	
	public static void main(String[] args) 
	{
		ImplimentedAbstractClass b=new ImplimentedAbstractClass();
		b.m1();
		b.m2();
		System.out.println(b.str);
		System.out.println(b.a);
	}
		
}
