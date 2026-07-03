package com.corejava;

public class Rectangle {
	
//	double length=7.8;
//	double breadth=10.0;
	
	
	
	void calculateArea()
	{
		
		double length=7.8;
		double breadth=10.0;
		
		double 	Area=length *breadth;
		double perimeter= 2*(length + breadth);
		
		System.out.println(" Area of the Rectangle : " + Area);
		System.out.println(" Perimeter of the Rectangle : " + perimeter);
	}
	

	public static void main(String[] args) {
	
	System.out.println("Area of the Rectangle & Perimeter");
	System.out.println("*************************************");
	Rectangle rcl = new Rectangle();
	rcl.calculateArea();
	
	}

}
