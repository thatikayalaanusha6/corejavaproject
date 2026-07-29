package com.fundamentals;

import java.util.Scanner;

public class LoanInterest {

	Scanner sc = new Scanner(System.in);
	
	void calculateInterest(double principle, double rate, int time) {
		System.out.println("Principle amount : "+principle);
		System.out.println("Principle amount : "+rate);
		System.out.println("Principle amount : " + time + "months");
	}
	
	
	
	
	 void main(String[] args) {
		 
		 System.out.println("main method started");
		 
		System.out.println("Enter the Principle Amount : ");
		double principle = sc.nextDouble();
		
		System.out.println("Enter the Rate  : ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter time : ");
		int time = sc.nextInt();
		
		calculateInterest(principle, rate, time);
		
		System.out.println("main method ended");

	}

}
