package com.corejava;

public class Debugging {

	public static void main(String[] args) {
		System.out.println(" Main Method Started ");
		method1();
		
	}
	
	
	static void method1()
	{
		method2();
		System.out.println(" Method 1 ");
	}

	
	static void method2()
	{
		Debugging d = new Debugging();
		d.method3();
		System.out.println(" Method 2 ");
	}
	
	void method3()
	{
		 method4();
		System.out.println(" Method 3 ");
	}
	
	void method4()
	{
		
		System.out.println(" Method 4 ");
	}
	
	
}
