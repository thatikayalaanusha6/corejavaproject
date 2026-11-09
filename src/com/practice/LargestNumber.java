package com.practice;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int a= sc .nextInt();
		
		System.out.println("Enter b number: ");
		int b= sc .nextInt();
		
		if(a > b) {
		    System.out.println("a is Largest Number");
		}
		else if(b > a) {
		    System.out.println("b is Largest Number");
		}
		else {
		    System.out.println("Both are Equal");
		}
	}

}
