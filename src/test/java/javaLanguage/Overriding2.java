package javaLanguage;

public class Overriding2 extends Overriding1
{
public void m1() 
{
	System.out.println("Method is overriden in Child class");
	}
public void m2() {}
public static void main(String[] args) {
	Overriding1 parent=new Overriding1();
	Overriding2 child=new Overriding2();
	
	Overriding1 parent1=new Overriding2();
	parent1.m1();
	//Overriding2 child1=new Overriding1();
	
	parent.m1();
	child.m1();
	
}
}
