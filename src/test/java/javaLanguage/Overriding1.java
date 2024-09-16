package javaLanguage;

public class Overriding1 
{
public void m1() 
{
	System.out.println("Parent method");
}

public void m3() 
{
	System.out.println("Parent method");
	
	
	
}

public void m4() 
{
	System.out.println("Parent method");
	
	Overriding1 parent1=new Overriding2();
	parent1.m1();
}
}
