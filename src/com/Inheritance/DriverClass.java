package com.Inheritance;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("Enter your Name: ");
String name = sc.next();

System.out.println("Enter your Marks: ");
double marks = sc.nextDouble();

System.out.println("Enter your Choise");
int choise = sc.nextInt();


Student1 s1 ;

switch(choise)
{
	case 1:
	System.out.println("Engineering Student");
	 s1 = new EngineeringStudent(name,marks);
	s1.CalculateGrade(marks);
	break;
	
	case 2:
	System.out.println("Medical Student");
	 s1 = new Medical(name,marks);
	s1.CalculateGrade(marks);
	break;
	
	case 3:
	System.out.println("Management Student");
	 s1 = new Management(name,marks);
	s1.CalculateGrade(marks);
	break;
	
	default:
		System.out.println("Invalid choise");

}


	}

}
