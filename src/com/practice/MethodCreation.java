package com.practice;

public class MethodCreation {
	void add() {
		int a = 10;
		int b = 20;
		 int c = a + b ;
		 System.out.println("c="+c);
	}

	public static void main(String[] args) {
	
		MethodCreation mc = new MethodCreation();
		mc.add();
	}

}
