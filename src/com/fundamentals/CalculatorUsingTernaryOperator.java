package com.fundamentals;
import java.util.Scanner;
public class CalculatorUsingTernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int fnum = sc.nextInt();
		System.out.println("Enter second number : ");
		int snum = sc.nextInt();
		System.out.println("Enter the operator + or - : ");
		char op = sc.next().charAt(0);
		
		int result = (op == '+')? fnum + snum : fnum - snum;
		System.out.println("The anuswer is :" +result);
	}

}
