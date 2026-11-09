package com.loops;

import java.util.Scanner;

public class BankAccountDrive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount b1 = new BankAccount();
		

		System.out.println("Enter the Account Number: ");
		long Accountnumber=sc.nextLong();
		b1.setAccountnumber(Accountnumber);
		
		System.out.println("Enter Your Name: ");
		String Holdername = sc.next();
		b1.setHoldername(Holdername);
	
		System.out.println("Your Current Balance: ");
	
		
		System.out.println(b1.getBalance());
		
		System.out.println("enter deposit amount");
		double d=sc.nextDouble();
         b1.deposite(d);
         System.out.println("Your Current Balance After Depositing: ");
         b1.deposite(d);
         
System.out.println(b1.getBalance());
b1.withdraw(200);
System.out.println("Your Current Balance After Withdrawn: ");
System.out.println(b1.getBalance());
		
		

	}

}
