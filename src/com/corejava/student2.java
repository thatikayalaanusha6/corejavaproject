package com.corejava;

public class student2 {
	
	int studentID;
	int age;
	String name;
	String Address;
	

	public static void main(String[] args) {
		
		student2 Puppy = new student2();
//		int studentID = 102;
//		int age = 21;
		
//	String name = "Anusha";
//	String Address = "Himmathnagar";
		
		Puppy.studentID = 11;
		Puppy.age = 21;
		Puppy.name = "Anusha";
		Puppy.Address = "Himmathnagar";
		
	System.out.println(Puppy.studentID);
	System.out.println(Puppy.age);
	System.out.println(Puppy.name);
	System.out.println(Puppy.Address);
	
	System.out.println("*********************************************");
	
	student2 Anu = new student2();
	
	Anu.studentID = 10;
	Anu.age = 20;
	Anu.name = "Anu";
	Anu.Address = "Hyd";
	
	System.out.println(Anu.studentID);
	System.out.println(Anu.age);
	System.out.println(Anu.name);
	System.out.println(Anu.Address);
		
		
		

	}

}
