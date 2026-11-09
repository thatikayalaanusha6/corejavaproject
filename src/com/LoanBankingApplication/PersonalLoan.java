package com.LoanBankingApplication;

import java.util.Scanner;

public class PersonalLoan extends LoanImpl{
	
	
	void getPersonalLoanDocInfo(){
		System.out.println("All personal loan documents verified successfully !! ");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Welcome to Loan Banking");
		System.out.println("*********************************");
		
		PersonalLoan pl = new PersonalLoan();
		double salary = pl.getCustomerSalary();
		int age = pl.getCustomerAge();
		int cibil = pl.getCibilScore();
		
		if(salary >= 1000000.00 && age >= 26 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("Basic information is valid check personal details ");
		
			
			if(pl.isphoneValid() && pl.isAadharValid() && pl.isPanValid()) {
				System.out.println("Details are good Loan got approved !!");
				System.out.println("Your roi is : "+pl.getLoanRateOfInterest());
				pl.getPersonalLoanDocInfo();
			}else {
				System.out.println("Something went wrong!!");
			}
		}else {
			System.out.println("You are not eligible for personal loan and your loan got rejected");
		}
		System.out.println("main method ended");

	}

}
