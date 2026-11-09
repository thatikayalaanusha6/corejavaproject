package com.LogicalStatements;
import java.util.Scanner;

public class EvenOrOdd {
//	Check if a number is even or odd.
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
System.out.println("Enter a number: ");
int num = sc.nextInt();

 if (num % 2 == 0)
 {
	System.out.println("Even number"); 
 }
 else {
	 System.out.println("odd number");
 }
	}

}
