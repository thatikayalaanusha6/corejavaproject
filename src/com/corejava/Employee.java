package com.corejava;

public class Employee {
	
	static String companyName; 
	static String location ;
	
	String employeeName;
	double salary;

	void disp()
	{
		System.out.println("Name of the Company :" + companyName);
		System.out.println("Employee Location :" + location);
		System.out.println("Name of the Employee :" + employeeName );
		System.out.println("Emplyee Salary :" + salary);
	}
	public static void main(String[] args) {
		
System.out.println(" The above information is about the employees in the Infosys Company");

	}
	
	static {
	
		companyName="Infosys";
		
		location="Hightech City";
		
		Employee emp = new Employee();
		emp.employeeName="Anusha";
		emp.salary=40000.30;
		emp.disp();
		          
		System.out.println("************************************************");
		
		Employee em = new Employee();
		em.employeeName="Anu";
		em.salary=50000.50;
		em.disp();
		
		
	}
}
