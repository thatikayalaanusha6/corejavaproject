package com.exceptionhandling;

import java.util.Scanner;

class AnuException extends Exception{
	public AnuException(String message){
		super(message);
	}
	
}
public class AgeRegistration {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		
		try {
			if(age<18) {
				throw new AnuException("Age must be 18 or above");
			}
			System.out.println("Registration Successful");
		}catch(AnuException ae) {
			System.out.println("AnuException: "+e.getMessage());
		}
		sc.close();
	}

}
