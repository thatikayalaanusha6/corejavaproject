package com.corejava;

public class Habits {
	
	String name;
	
	String habit;

	static String collegename = "V CUBE";
	

	public static void main(String[] args) {
		
		
//		System.out.println(collegename);
//		System.out.println(Habits.collegename);
		
		Habits Anu = new Habits();
		Anu.name = "Anusha";
		Anu.habit = "eating";
		System.out.println(Anu.name);
		System.out.println(Anu.habit);
		System.out.println(collegename);
		
		System.out.println("********************************************");
		
			
		Habits Prameela = new Habits();
		Prameela.name = "Anu";
		Prameela.habit = "Praying";
		System.out.println( Prameela.name);
		System.out.println(Prameela.habit);
		System.out.println( collegename);
		
		System.out.println("********************************************");
		
		
		Habits Reddy = new Habits();
		Reddy.name = "Koti Reddy";
		Reddy.habit = "Smoking";
		System.out.println( Reddy.name);
		System.out.println(Reddy.habit);
		System.out.println(collegename);
	}

}
