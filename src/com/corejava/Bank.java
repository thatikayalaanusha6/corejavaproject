package com.corejava;

public class Bank {

	static long nextAccountNumber = 10012010;
	long AccountNumber;
	static String BankName = "SBI";
	static String IFSC_code = "AF2347H";
	String Account_Holder_name;
	double Balance;
	
	Bank() {
		AccountNumber=nextAccountNumber;
		nextAccountNumber++;
		
		
	}
	 
	 void Disp() {
		 System.out.println("Name of the Bank: "+BankName);
		 System.out.println("IFSC code: "+IFSC_code);
		 System.out.println("Account Number: "+AccountNumber);
		 System.out.println("Account Holder Name: "+Account_Holder_name);
		 System.out.println("Balance: "+Balance);
	 }
	
	public static void main(String[] args) {
		
		Bank b1 = new Bank();
		b1.Account_Holder_name="Anusha";
		b1.Balance=200000.00;
		
		Bank b2 = new Bank();
		b2.Account_Holder_name="Akshitha";
		b2.Balance=100000.00;
		
		Bank b3 = new Bank();
		b3.Account_Holder_name="Amulya";
		b3.Balance=95000.00;
		
		System.out.println(nextAccountNumber);
		
		
	   b1. Disp();
	 
	   b2. Disp();
	  
	   b3. Disp();
	   

	}

}
