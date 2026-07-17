package com.fundamentals1_methods;

public class TestMethodsDemo1 {

	//1) No Return Type + No Arguments
	public static void main(String[] args) {
		
		System.out.println("main method started");
		// calling the method directly
		hello() ;
		TestMethodsDemo1 t = new TestMethodsDemo1();
		// calling the method by using object reference variable
		t.show();
	}
	
	// instance method 
	private void show() 
	{
		System.out.println("show method called");
		
	}
	
	// static method
	private static void hello() 
	{
		System.out.println("Hello !! Good Morning have a nice day !!");
	}

}
