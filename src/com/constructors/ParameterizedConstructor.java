package com.constructors;

public class ParameterizedConstructor {
String name;
	ParameterizedConstructor(String name){
		this.name=name;
	}
	
	public static void main(String[] args) {
		ParameterizedConstructor p = new ParameterizedConstructor("Anusha");
System.out.println(p.name);
	}

}
