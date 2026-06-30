package com.corejava;

public class EmployeeIDs {
	/*static int empid = 1000;
	String empname;
	{
		empid++;
		System.out.println(empid);
	}*/
	
	

    static int nextId = 1000; // Common ID generator

    int empid;        // Each employee's own ID
    String empname;

    {
        nextId++;
        empid = nextId;
    }

	public static void main(String[] args) 
	{
		/*EmployeeIDs emp = new EmployeeIDs();
		emp.empname="Anusha";
		System.out.println(emp.empname);
		
		System.out.println("________________________________________________");
		
		EmployeeIDs emp1 = new EmployeeIDs();
		emp1.empname="Sravani";
		System.out.println(emp1.empname);*/
		
		EmployeeIDs emp = new EmployeeIDs();
        emp.empname = "Anusha";

        EmployeeIDs emp1 = new EmployeeIDs();
        emp1.empname = "Sravani";

        EmployeeIDs emp2 = new EmployeeIDs();
        emp2.empname = "Akshitha";

        System.out.println("Employee Name : " + emp.empname);
        System.out.println("Employee ID   : " + emp.empid);

        System.out.println("-------------------------");

        System.out.println("Employee Name : " + emp1.empname);
        System.out.println("Employee ID   : " + emp1.empid);

        System.out.println("-------------------------");

        System.out.println("Employee Name : " + emp2.empname);
        System.out.println("Employee ID   : " + emp2.empid);
		
		
	}
	
	
	

	   
}


