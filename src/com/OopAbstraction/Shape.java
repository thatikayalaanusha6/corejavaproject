package com.OopAbstraction;

public abstract class Shape {
abstract void Area();
}


class Circle extends Shape{
int radius=5;
	@Override
	void Area() {
		double c= Math.PI * radius * radius;	
		System.out.println("Area of the Circle: "+c);
	}
	
}

class Rectangle extends Shape{
int length=10;
int width = 15;
	@Override
	void Area() {
		
	double r =	length * width;
	System.out.println("Area of the Rectangle: "+r);
	}
	
}


class Triangle extends Shape{
int base=5;
int height= 10;
	@Override
	void Area() {
		double t = 0.5 * base * height;
		System.out.println("Area of the Triangle: "+t);
		
	}
	
}


