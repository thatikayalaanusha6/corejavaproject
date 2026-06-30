package com.corejava;

public class Bankaccountcount {
	
	String account;
	static int count=0;
	{
		count++;
	}

	public static void main(String[] args) {
		
		Bankaccountcount bac = new Bankaccountcount();
		bac.account="A123B";
		System.out.println("Account Number :"+bac.account);
		System.out.println("************************************");

		Bankaccountcount bac1 = new Bankaccountcount();
		bac1.account="A124C";
		System.out.println("Account Number : "+bac1.account);
		System.out.println("************************************");

		Bankaccountcount bac2 = new Bankaccountcount();
		bac2.account="A125D";
		System.out.println("Account Number : "+bac2.account);
		
		System.out.println("************************************");
		
		System.out.println("Total Accounts : "+count);
	}

}
