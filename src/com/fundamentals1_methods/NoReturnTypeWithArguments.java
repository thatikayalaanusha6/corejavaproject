package com.fundamentals1_methods;

public class NoReturnTypeWithArguments {

	 void main(String[] args) {
	System.out.println("main method started");
	
	//calling no argument method
	 show();
	 
	 //call by value
	 show("Anusha");
	 show("Prameela");
	 show("Chandraiah");
	 
	System.out.println("main method ended");

	}
	
	void show()
	{
		System.out.println("good morning students!!");
	}
	
	
	void show(String name)
	{
		System.out.println("Name of the student is : " + name);
	}

}
