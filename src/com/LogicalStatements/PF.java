package com.LogicalStatements;
import java.util.Scanner;

//Check if a student passed or failed (marks >= 35).
public class PF {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.println("enter the marks: ");
int marks = sc. nextInt();

if(marks > 100 || marks < 0 ) {
	System.out.println("invalid");
}

else if(marks>=35) {
	System.out.println("pass");
}

else  {
	System.out.println("fail");
}


	}

}
