package com.loops;

import java.util.Scanner;

public class BankAccount {
Scanner sc = new Scanner(System.in);
	private long accountnumber;
	private String holdername;
	private double balance = 5000;
	
	
	
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber2) {
		this.accountnumber = accountnumber2;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public double getBalance() {
		return balance;
	}
	
	
	void deposite(double amount) {
		balance = balance + amount;
	}
	
	void withdraw(double amount) {
		if(amount<=balance) {
			balance = balance - amount;
		}else {
			System.out.println("You Account has Insufficient Balance");
		}
		
		
	}
}

