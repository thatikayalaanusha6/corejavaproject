package com.LogicalStatements;
import java.util.Scanner;

public class ConditionChecking {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("you are eligible for voting");
			System.out.println("WELCOME");
			
		}
		else {
			System.out.println("you are not eligible for voting");
			
		}
			
		}

	}


