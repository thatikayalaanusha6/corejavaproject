package com.constructors;

public class ParameterizedConstructor1 {
	
String name;
int age;

ParameterizedConstructor1(String name,int age ){
	this.name=name;
	this.age=age;
}

	public static void main(String[] args) {
		
		ParameterizedConstructor1 p1 = new ParameterizedConstructor1("Anusha",22);
System.out.println(p1.name);
System.out.println(p1.age);
	}

}
