package com.practice;

import java.util.Scanner;

public class Sum {
	
	int a;
	int b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter b number: ");
		int b = sc.nextInt();
		
		int Sum = a + b ;
		
		System.out.println("Result: "+Sum);
	}

}
