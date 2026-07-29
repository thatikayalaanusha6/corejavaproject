package com.fundamentals;

import java.util.Scanner;

public class StudentResult {

    void DisplayStudent(String name) {
        System.out.println("Name of the student: " + name);
    }

    void calculatetotal(int m1, int m2, int m3) {
        int total = m1 + m2 + m3;
        System.out.println("Total marks are: " + total);
    }

    void calculateaverage(int m1, int m2, int m3) {
        double average = (m1 + m2 + m3) / 3;
        System.out.println("Average marks are: " + average);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = sc.nextLine();

        System.out.println("Enter mark1:");
        int m1 = sc.nextInt();

        System.out.println("Enter mark2:");
        int m2 = sc.nextInt();

        System.out.println("Enter mark3:");
        int m3 = sc.nextInt();

        StudentResult sr = new StudentResult();

        sr.DisplayStudent(name);
        sr.calculatetotal(m1, m2, m3);
        sr.calculateaverage(m1, m2, m3);

   
    }
}