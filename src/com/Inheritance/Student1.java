package com.Inheritance;

public class Student1 {
	String name;
	double marks;
	Student1(String name,double marks) {
	this.name = name;
	this.marks=marks;
	
}
	void CalculateGrade(double marks){
	if(marks >= 90 && marks <= 100) {
		System.out.println("Grade A");
	}	else if(marks >= 70 && marks <= 80) {
		System.out.println("Grade B");
	}else if(marks >=40 && marks <= 60) {
		System.out.println("Grade C");
	}else
		System.out.println("fail");
	}
}

class EngineeringStudent extends Student1{
	EngineeringStudent(String name, double marks) {
		super(name, marks);
		
	}

	void CalculateGrade(double marks){
		if(marks >= 400 && marks <= 500) {
			System.out.println("Grade A");
		}	else if(marks >= 200 && marks <= 300) {
			System.out.println("Grade B");
		}else if(marks >=100 && marks <= 150) {
			System.out.println("Grade C");
		}else
			System.out.println("fail");
		}
}

class Medical extends Student1 {
	Medical(String name, double marks) {
		super(name, marks);
		
	}

	void CalculateGrade(double marks){
		if(marks >= 900 && marks <= 1000) {
			System.out.println("Grade A");
		}	else if(marks >= 700 && marks <= 800) {
			System.out.println("Grade B");
		}else if(marks <=300 && marks <= 600) {
			System.out.println("Grade C");
		}else
			System.out.println("fail");
		}
}

class Management extends Student1{
	Management(String name, double marks) {
		super(name, marks);
		
	}

	void CalculateGrade(double marks){
		if(marks >= 500 && marks <= 600) {
			System.out.println("Grade A");
		}	else if(marks >= 350 && marks <= 500) {
			System.out.println("Grade B");
		}else if(marks >=50 && marks <= 340) {
			System.out.println("Grade C");
		}else
			System.out.println("fail");
		}
}