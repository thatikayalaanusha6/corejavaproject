package com.practice;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter b number: ");
		int b = sc.nextInt();
		
		System.out.println("Enter c number: ");
		int c = sc.nextInt();
		
		
		
	if(a>b && a>c) {
		System.out.println("a is Largest Number");
	}else if(a<b && b>c) {
		System.out.println("b is Largest Number");
	}else if(c>a && c>b) {
		System.out.println("c is Largest Number");
	}else {
		System.out.println("equal numbers");
	}
	}

}
