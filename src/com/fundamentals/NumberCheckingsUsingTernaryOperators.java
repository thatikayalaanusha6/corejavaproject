package com.fundamentals;

public class NumberCheckingsUsingTernaryOperators {

	public static void main(String[] args) {
		int a = 345676;
		
		
		
	String 	pn = (a>0)? "positive" : "negative";
	System.out.println("The Number Is: "+pn  +" : "  +a);
	
	int marks=45;
	String pf = (marks >= 90)? "A" : (marks >= 75)?  "B" : (marks >= 60)? "C": (marks >= 40)?  "D"  : "fail";
System.out.println(pf);
	}

}
