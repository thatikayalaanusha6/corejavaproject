package com.LogicalStatements;
import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks > 100 || marks < 0) {
        	System.out.println("Invalid");
        }
        
        else if (marks >= 51 && marks <= 100) {
            System.out.println("Grade A");
        }
        else if (marks >= 31 && marks <= 50) {
            System.out.println("Grade B");
        }
        else if (marks >= 21 && marks <= 30) {
            System.out.println("Grade C");
        }
        else if (marks >= 10 && marks <= 20) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("fail");
        }

        sc.close();
    
		
			
	}

}
