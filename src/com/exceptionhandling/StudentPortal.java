package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentPortal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			String name=null;
			System.out.println("Student Name Length: "+name.length());
		
		}catch(NullPointerException e) {
			System.out.println("Error: String is null");
		}

		try {
			System.out.println("Enter Your Age:");
			int age=sc.nextInt();
			System.out.println("Age: "+age);
		}catch(InputMismatchException e) {
			System.out.println("Error: Please Enter a Valid Integer");
			sc.next();
		}
		
		try {
			int totalMarks=450;
			int numberOfSubjects=0;
			int average = totalMarks/numberOfSubjects;
			System.out.println("Average Marks: "+average);
		}catch(ArithmeticException e) {
			System.out.println("Error: Cannot divide by Zero");
			
		}
		
		try {
			int[] Marks = {80, 75, 90, 85, 70};
			System.out.println("Enter Array Index: ");
			int index = sc.nextInt();
			System.out.println("Marks: "+Marks[index]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Invalid Array Index");
			
		}
		
		finally {
			System.out.println("Student Portal Operations Completed.");
			sc.close();
		}
		
	}

}
