package com.OopAbstraction;

public abstract class Account {
	
	static void BankName() {
		System.out.println("Bank Name: SBI");
	}
	
	
	void AccountType() {
		System.out.println("Account type: Savings");
	}
	
	
abstract void CalculateInterest() ;
	
}
