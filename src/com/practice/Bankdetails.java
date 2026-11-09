package com.practice;

public class Bankdetails {

	public static void main(String[] args) {
		Bank b = new Bank();

        b.setAccountHolder("Anusha");
        b.setAccountNumber(1234567890L);
        b.setBalance(5000);

        System.out.println("Bank Account Details");
        System.out.println("Account Holder: " + b.getAccountHolder());
        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Balance: Rs. " + b.getBalance());

	}

}
