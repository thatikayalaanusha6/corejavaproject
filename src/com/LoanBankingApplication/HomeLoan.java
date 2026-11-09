package com.LoanBankingApplication;

public class HomeLoan extends LoanImpl{
	

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Welcome to Home Loan Banking");
		System.out.println("*********************************");
		
		HomeLoan h = new HomeLoan();
		double salary = h.getCustomerSalary();
		int age = h.getCustomerAge();
		int cibil = h.getCibilScore();
		
		if(salary >= 800000.00 && age >= 25 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("Basic information is valid check personal details ");
		
			
			if(h.isphoneValid() && h.isAadharValid() && h.isPanValid()) {
				System.out.println("Details are good Home Loan got approved !!");
				System.out.println("Your roi is : "+h.getLoanRateOfInterest());
				h.getHomeLoanDocInfo();
			}else {
				System.out.println("Something went wrong!!");
			}
		}else {
			System.out.println("You are not eligible for Home loan and your loan got rejected");
		}
		System.out.println("main method ended");

	}

	

private void getHomeLoanDocInfo() {
	System.out.println("All personal loan documents verified successfully !! ");
}
}

