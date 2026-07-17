package com.fundamentals1_methods;
import java.util.Scanner;

//2) No Return type + with Arguments-----> Scanner
public class TestDemoMethods4 {

	
	 void getname(String fname, String lname) {
		System.out.println("Employee Full Name : " + fname + " " + lname);
	}
	
	void getage(int age) {
		System.out.println("Age of the employee : " + age);
	}
	
	void salaryInfo(double salary) {
		System.out.println("Employee salary is : " + salary);
	}
	
	
	void heightandweightInfo(float height, double weight) {
		
		System.out.println("Employee height : " + height);
		System.out.println("Employee weight : " + weight);
	}
	
	 void main() {
		 
	System.out.println("main method started");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your age : ");
	int age = sc.nextInt();
	
	
	System.out.println("Enter your first name : ");
	sc.nextLine();
	String fname = sc.nextLine();
	
	System.out.println("Enter your last name : ");
	String lname = sc.nextLine();
	

	System.out.println("Enter your salary info : ");
	double sal = sc.nextDouble();
	
	
	System.out.println("Enter your height : ");
	float h = sc.nextFloat();
	
	System.out.println("Enter your weight : ");
	double w = sc.nextDouble();
	
	
	
	getage(age);
	getname(fname, lname);
	salaryInfo(sal);
	heightandweightInfo(h, w);
	
	System.out.println("main method ended");

	}

}
