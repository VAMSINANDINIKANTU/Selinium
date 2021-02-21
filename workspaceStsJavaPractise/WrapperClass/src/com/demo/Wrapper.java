package com.demo;

public class Wrapper {
	public static void main(String[] args) {
//		int num1=10;
//		Integer onj=Integer.valueOf(num1);
//		System.out.println("Number is"+num1 );
//		//creating wrapper class
		// Integer obj=new Integer(100);
		// convert wrapper class into obj
		// int num=obj.intValue();
		// System.out.println(+num);

		byte a = 1;

		Byte bobj = new Byte(a);

		int b = 20;

		Integer intobj = new Integer(b);

		float c = 18.6f;

		// wrapping around Float object
		Float floatobj = new Float(c);

		// double data type
		double d = 250.5;

		// Wrapping around Double object
		Double doubleobj = new Double(d);

		// char data type
		char e = 'a';

		// wrapping around Character object
		Character charobj = e;

		// printing the values from objects
		System.out.println("Values of Wrapper objects (printing as objects)");
		System.out.println("Byte object byteobj:  " + bobj);
		System.out.println("Integer object intobj:  " + intobj);
		System.out.println("Float object floatobj:  " + floatobj);
		System.out.println("Double object doubleobj:  " + doubleobj);
		System.out.println("Character object charobj:  " + charobj);

		// objects to data types (retrieving data types from objects)
		// unwrapping objects to primitive data types
		byte bv = bobj;
		int iv = intobj;
		float fv = floatobj;
		double dv = doubleobj;
		char cv = charobj;

		// printing the values from data types
		System.out.println("Unwrapped values (printing as data types)");
		System.out.println("byte value, bv: " + bv);
		System.out.println("int value, iv: " + iv);
		System.out.println("float value, fv: " + fv);
		System.out.println("double value, dv: " + dv);
		System.out.println("char value, cv: " + cv);
	}

}
