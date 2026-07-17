package com.fundamentals1_methods;

public class TestDemoMethods3 {

	double balance = 100000.00;
	 void main(String[] args) {
		
	System.out.println("Welcome to Vcube Banking!");
	
		checkbalance();
		 deposite(50000);
		 withdraw(40000);

	}
	 
	 void checkbalance()
	 {
		 System.out.println("current balance is : " + balance);
	 }
	 
	 
	 void deposite(double amount)
	 {
		 
		 System.out.println("deposite amount is "+amount);
		 balance = balance + amount;
		 checkbalance();
	 }
	 
	 void withdraw(double paisa)
	 { 
		 System.out.println("withdraw amount is " +paisa);
		balance = balance - paisa;
		 checkbalance();
	 }
	 

}
