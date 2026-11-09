package com.LogicalStatements;
import java.util.Scanner;

//Find the greatest of three numbers.
//Check if a year is a leap year.
public class Greatest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter first number: ");
		int a1 = sc.nextInt();
		
		System.out.println(" Enter second number: ");
		int a2 = sc.nextInt();
		
		System.out.println(" Enter third number: ");
		int a3 = sc.nextInt();
		
		if (a1 > a2 && a1 > a3) {
			System.out.println("a1 is grater");
		}
		else if (a2 > a1 && a2 > a3) {
			System.out.println("a2 is greater");
		}
		else {
			System.out.println("a3 is greater");
		}
		

	}

}
