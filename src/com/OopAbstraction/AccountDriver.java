package com.OopAbstraction;

public class AccountDriver {

	public static void main(String[] args) {
		Account.BankName();
		
		SavingsAccount s = new SavingsAccount();
		CurrentAccount c = new CurrentAccount();
		s.AccountType();
		s.CalculateInterest();
		c.CalculateInterest();
		

	}

}
