package com.Inheritance;


class Vehicle1 {
	int speed = 50;
	void Display() {
		System.out.println("vehicle class executed");
	}
}


class Car1 extends Vehicle1{
	int speed = 100;
void Display() {
		System.out.println("car class executed: "+speed);
	}
}


public class Inheritance1 {

	public static void main(String[] args) {
		Vehicle1 v = new Car1();
		System.out.println("Speed: "+v.speed);
		v.Display();

	}

}
