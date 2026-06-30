package com.corejava;

public class Test1 {
	
	
	static Test1 t1 = new Test1();
	
	static {
		System.out.println("Hi, static");
	}
	
	static Test1 t2 = new Test1();
	{
		System.out.println("hiiiiiiii, instance");
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(" Hello World ");
	}
	
	
	{
		System.out.println("Anu, instance");
		
	}

	static {
			System.out.println("Hi, static");
		}
		
		{
			System.out.println("Hello, instance");
//			 Test1 t3 = new Test1();//java.lang.StackOverflowError
		}
		

	}


