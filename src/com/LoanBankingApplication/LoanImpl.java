package com.LoanBankingApplication;

import java.util.Scanner;

public class LoanImpl implements Loan{
	
	Scanner sc = new Scanner(System.in);
	public boolean isphoneValid() {
		System.out.println("Enter your Mobile Number: ");
		String phone = sc.next();
		return phone.matches("[6-9]{1}[0-9]{9}");
	}
	
	
	public boolean isAadharValid() {
		System.out.println("Enter your Aadhar Number: ");
		String aadhar = sc.next();
		return aadhar.matches("[1-9]{1}[0-9]{11}");
	}
	
	public boolean isPanValid() {
		System.out.println("Enter your PAN details: ");
		String pan = sc.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}
	
	
	public double getLoanRateOfInterest(){
		double roi = 8.5;
		int cibil = getCibilScore();
		if(cibil >= 300 && cibil <= 549) {
			System.out.println("Poor - High risk; Loan Applications are likely to be rejected or approved at high interest rates");
			roi = roi + 4.0;
		}else if(cibil >= 550 && cibil <= 699) {
			System.out.println("Fair - moderate risk; may face limitations in credit approval");
			roi = roi + 2.0;
		}else if (cibil >= 700 && cibil <= 749) {
			System.out.println("Good - low risk; better chance of loan approval with favorable terms");
			roi = roi + 1.5;
		}else if(cibil >= 750 && cibil <=900) {
		System.out.println("Excellent - very low risk; highest likelihood of approval and access to lower interest rates");
		roi = roi + 0.5;
		}else {
			System.out.println("Invalid cibil information !! Can you connect with Relationship Manager of your Bank");
			roi = roi + 10.0;
		}
		return roi;
	}
	
	
	public int getCibilScore(){
		System.out.println("Enter your Cibil Score: ");
		int cibil=sc.nextInt();
		return cibil;	
	}
	
	
	public double getCustomerSalary(){
	System.out.println("Enter your Salary: ");	
	double salary = sc.nextDouble();
	return salary;
	}

	
	public int getCustomerAge() {
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		return age;
	}
	
}
