package com.LogicalStatements;
import java.util.Scanner;

public class NumberChecking {
//	Check if a number is positive or negative.

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value : ");
		int num = sc.nextInt();
		
		if(num > 0 ) 
			System.out.println("The entered value is  positive number i.e " +":" +num);
		
		else 
			System.out.println("The entered value is  negative number i.e " +":" +num);
		
	}

}
