package com.loops;

import java.util.Scanner;

public class SecondLargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the series of numbers: ");
        int n=sc.nextInt();
        int largest=-1;
        int second = -1;
        while(n>0) {
        	int digit = n%10;
        	if(digit>largest) {
        		second = largest;
        		largest=digit;
        	}else if(digit>second && digit != largest) {
        		second=digit;
        	}
        	n=n/10;
        }
        System.out.println("Second Largest Digit: "+second);
	}

}
