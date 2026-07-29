package com.corejava;
import java.util.Scanner;
public class SalarySlipGenerator {
	int employeeName;
	String basicSalary;

	void salarySlip(String employeeName, double basicSalary) {
		double HRA = basicSalary * 20/100;
		double DA =  basicSalary * 10/100;
		double GrossSalary = basicSalary + HRA +DA;
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("HRA(20%): "+HRA);
		System.out.println("DA=10%: "+DA);
		System.out.println("Gross Salary: "+GrossSalary);
	}
	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);

System.out.println("Enter Employee Name: ");

String employeeName = sc.nextLine();

System.out.println("Enter employee basic salary : ");
double basicSalary = sc.nextDouble();

SalarySlipGenerator ssp = new SalarySlipGenerator(); 
ssp.salarySlip(employeeName, basicSalary);

	}

}
