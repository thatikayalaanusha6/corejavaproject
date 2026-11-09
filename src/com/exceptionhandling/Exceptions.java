package com.exceptionhandling;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number: ");
			String str1 = sc.nextLine();
			
			System.out.println("Enter b number: ");
			String str2 = sc.nextLine();
			int num1= Integer.parseInt(str1);
			int num2= Integer.parseInt(str2);
			 
			int result= num1/num2;
			System.out.println("Division Result: "+result);
			
			
		}catch(NumberFormatException ne) {
			System.out.println("Invalid number, please enter number only");
		}catch(ArithmeticException e) {
			System.out.println("Cannot divisible by Zero");
		}
		
int[] a= {10, 20, 30, 40, 50};
try {
	System.out.println("Enter array index 0 to 4");
	int index= sc.nextInt();
	System.out.println("Array element: "+a[index]);
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Invalid index");
}
sc.close();
	}

}
