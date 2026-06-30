package com.corejava;

public class Hello {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started");
		
		
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
		
		Class.forName("com.corejava.Welcome");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		
		System.out.println("main method ended");
		

	}

}
