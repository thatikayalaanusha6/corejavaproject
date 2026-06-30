package com.corejava;

public class objectcount {
static int Count = 0;
	
	{
		Count++;
		System.out.println("Object count : "+Count );
	}
	
	
	public static void main(String[] args) 
	{
		objectcount anu = new objectcount();
		objectcount anusha = new objectcount();
		objectcount flower = new objectcount();
		objectcount pegion = new objectcount();
		objectcount parrot = new objectcount();
		
		/*System.out.println(obj1.Count);
		System.out.println(obj2.Count);
		System.out.println(obj3.Count);
		System.out.println(obj4.Count);
		System.out.println(obj5.Count);*/


	}

}
