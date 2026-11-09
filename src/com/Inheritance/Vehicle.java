package com.Inheritance;

public class Vehicle {
	void start() {
		System.out.println("it's a class");
	}
	
}
	class  Car extends Vehicle{
		
		void start() {
			System.out.println("iam a Vehicle");
		}
	    
		void drive() {
			System.out.println("Iam driving Car");
		}

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.drive();
		

	}

}
