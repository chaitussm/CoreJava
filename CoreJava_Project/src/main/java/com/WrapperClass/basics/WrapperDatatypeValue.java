package com.WrapperClass.basics;

public class WrapperDatatypeValue 
{

	public static void main(String[] args) 
	{
		Integer I = new Integer(130);
		System.out.println(I.byteValue());
		System.out.println(I.intValue());
		System.out.println(I.shortValue());
		System.out.println(I.doubleValue());
		System.out.println(I.floatValue());
		System.out.println(I.longValue());
		
		System.out.println("************For Character type***********");
		Character ch = new Character('a');
		char c = ch.charValue();
		System.out.println(c);
		System.out.println("************For Boolean type***********");
		Boolean b = Boolean.valueOf("durga");
		Boolean d = b.booleanValue();
		System.out.println(d);

		
		

	}

}
