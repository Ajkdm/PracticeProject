package javaLanguage;

import org.testng.annotations.Test;

public class BoxingAndUnBoxing
{
	@Test(priority=1)
	public void boxing() 
	{
		//Converting from primitive data types to corresponding object wrapper class is called boxing
		System.out.println("---------Boxing---------");
		System.out.println();
	
		byte b=5;
		Byte b2=Byte.valueOf(b);
		System.out.println(b2);
		
		short s=10;
		Short s2=Short.valueOf(s);
		System.out.println(s2);
		
		int i=15;
		Integer i2=Integer.valueOf(i);
		System.out.println(i2);
		
		long l=20;
		Long l2=Long.valueOf(l);
		System.out.println(l2);
		
		float f=25f;
		Float f2=Float.valueOf(f);
		System.out.println(f2);
		
		double d=30.5;
		Double d2=Double.valueOf(d);
		System.out.println(d2);
		
		boolean bl=true;
		Boolean bl2=Boolean.valueOf(bl);
		System.out.println(bl2);
		
		char c='A';
		Character c2=Character.valueOf(c);
		System.out.println(c2);	
		
	}
	
	@Test(priority=2)
	public void unBoxingManual() 
	{
		//Converting object wrapper class to its corresponding primitive data type is called unboxing
		System.out.println("---------Boxing(Manual)---------");
		System.out.println();
		
		Byte b=(byte)6;
		byte b2=b.byteValue();
		System.out.println(b2);
		
		Short s=(short)12;
		short s2=s.shortValue();
		System.out.println(s2);
		
		
		Integer i=Integer.valueOf(18);
		int i2=i.intValue();
		System.out.println(i2);
		
		Long l=Long.valueOf(24);
		long l2=l.longValue();
		System.out.println(l2);
		
		Float f=Float.valueOf(30);
		float f2=f.floatValue();
		System.out.println(f2);
		
		Double d=Double.valueOf(36.6);
		double d2=d.doubleValue();
		System.out.println(d2);
		
		Boolean bl=Boolean.valueOf(true);
		boolean bl2=bl.booleanValue();
		System.out.println(bl2);
		
		Character c=Character.valueOf('A');
		char c2=c.charValue();
		System.out.println(c2);
	}
	
	@Test(priority=3)
	public void autoBoxingAndUnboxing() 
	{
		//Converting object wrapper class to its corresponding primitive data type vice verse 
		//without calling methods explicitly is called autoboxing and Autounboxing
		System.out.println("---------Auto Boxing And Unboxing---------");
		System.out.println();
		
		Byte b=7;//
		byte b2=b;
		System.out.println(b2);
		
		Short s=14;
		short s2=s;
		System.out.println(s2);
		
		Integer i=21;
		int i2=i;
		System.out.println(i2);
		
		
		Long l=28l;
		long l2=l;
		System.out.println(l2);
		
		Float f=35f;
		float f2=f;
		System.out.println(f2);
		
		Double d=42.7;
		double d2=d;
		System.out.println(d2);
		
		Boolean bl=true;
		boolean bl2=bl;
		System.out.println(bl2);
		
		Character c='A';
		char c2=c;
		System.out.println(c2);
	}
}
