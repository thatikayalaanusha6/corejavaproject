package com.Inheritance;

public class Person {
	String name;
	int age;

	void person() {
		System.out.println("Name : " + name);
		System.out.println("Name : " + age);
	}
}

class Student extends Person {
	 String collegename;

	void std() {
		System.out.println("College Name: " + collegename);
	}

	public static void main(String[] args) {
		Student1 s = new Student1(collegename, age);
		s.name = "Anusha";
		s.age = 22;
s.person();
s.std();
	}

}
