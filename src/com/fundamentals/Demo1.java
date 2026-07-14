package com.fundamentals;

public class Demo1 {

	int EmployeeID = 1001;
	char EmployeeGrade = 'A';
	double EmployeeSalary = 55000.0D;
	boolean PermanentEmpStatus = true;
	String Workingdays = "5 workingdays";
	long phonenumber = 7989704841L;
	float BonusAmount = 5000.0f;
	
	void Disp(){
		System.out.println("Employee ID : " +EmployeeID);
		System.out.println("Employee Grade : " +EmployeeGrade);
		System.out.println("Employee Salary : "+EmployeeSalary);
		System.out.println("Permanant Employee Status : " +PermanentEmpStatus);
		System.out.println("Employee WorkingDays : " +Workingdays);
		System.out.println("Employee Phone Number : " +phonenumber);
		System.out.println("Employee Bonus Amount : " +BonusAmount);
		
	}
	
	
	public static void main(String[] args) {
System.out.println("Details of an Emplyee");
System.out.println("************************************");

    Demo1 d1 = new Demo1();
    d1.Disp();
	}

}
