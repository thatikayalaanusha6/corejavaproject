package com.corejava;
import java.util.Scanner;

public class OPerations {
	

	void add(int a,int b)
	{
	System.out.println("Addition of two numbers: "+(a+b));	
	}
	
	void subtraction(int a, int b)
	{
		System.out.println("Subtracting two numbers: "+(a-b));	
	}
	
	void multiplication(int a,int b)
	{
		System.out.println("multiplication of two numbers: "+(a*b));	
	}
	
	void division(int a, int b)
	{
		System.out.println("division of two numbers: "+(a/b));	
	}
	 void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter two numbers a & b :");
	int a = sc.nextInt();
	int b=sc.nextInt();
	
	
	add(a,b);
	subtraction(a,b);
	multiplication(a,b);
	division(a,b);

	}

}
