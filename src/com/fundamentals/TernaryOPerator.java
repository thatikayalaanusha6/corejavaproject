package com.fundamentals;

public class TernaryOPerator {

	public static void main(String[] args) {
		char ch = 'f';
		String result = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )? "VOWEL" : "CONSONANT";
		System.out.println("The letter is : "+ch + " : "+result);
	}

}
