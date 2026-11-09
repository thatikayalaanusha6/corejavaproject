package com.loops;

import java.util.Scanner;

public class Neonnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		long n = sc.nextLong();
	
		 long sum = 0;
		 for (long square = n * n; square > 0; square = square / 10 ) {
		 sum = sum + (square % 10);
		 }
		 if (sum == n) {
			 System.out.println(n + " is a neon number");
		 }
		 else 
		 {
			 System.out.println(n + " is not a neon number");
		 }
		 }	
		}
	


