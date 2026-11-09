package com.casestudy;

import java.util.Scanner;

 class BankTransaction {
    long Aadhaarnumber;
	long accountnumber;
	int pin ;
	double Balanace = 10000.00;
	

	  
	  
	 void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter pin to check total balance : ");
		double balance = sc.nextDouble();
		System.out.println("Balance is : "+Balanace);
		
		System.out.println("Enter account number to deposite money: ");
		long acnum = sc.nextLong();
		
System.out.println("Enter the deposite amount: ");
double damt = sc.nextDouble();

       

		
	}

}
