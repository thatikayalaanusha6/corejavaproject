package com.constructors;
class Employee {
    int empId;
    String empName;
    double salary;

    // Parameterized constructor
    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Copy constructor
    Employee(Employee e) {
        this.empId = e.empId;
        this.empName = e.empName;
        this.salary = e.salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("ID     : " + empId);
        System.out.println("Name   : " + empName);
        System.out.println("Salary : " + salary);
    }

    // Method to increment salary
    void incrementSalary(double amount) {
        salary += amount;
    }



    public static void main(String[] args) {

        // Create emp1 using parameterized constructor
        Employee emp1 = new Employee(101, "Krishna", 50000);

        // Create emp2 using copy constructor
        Employee emp2 = new Employee(emp1);

        // Increase salary of emp2
        emp2.incrementSalary(10000);

        // Change name of emp2
        emp2.empName = "Ravi";

        // Display both employees
        System.out.println("Employee 1");
        emp1.display();

        System.out.println();

        System.out.println("Employee 2");
        emp2.display();
    }
}