package com.LogicalStatements;
import java.util.Scanner;

//Find the greater of two numbers.

public class GreaterNumber {
//static int a=1678;
//static int b=2892;
	
	public static void main(String[] args) {
		
//		if (a > b) {
//			System.out.println("a is greater");
//		}
//		else {
//			System.out.println("b is greater");
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int a = sc.nextInt();
		
		System.out.println("enter b number:");
		int b = sc.nextInt();
		System.out.println("*********************************");
		
		if (a > b) {
			System.out.println("a is bigger number");
		}
		else if(a == b) {
			System.out.println("both a & b equal");
		}
		else {
			System.out.println("b is bigger number");
		}
	}

}
