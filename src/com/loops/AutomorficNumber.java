package com.loops;

import java.util.Scanner;

public class AutomorficNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("Enter a number : ");
int n = sc.nextInt();
int square = n*n;
int temp = n;
int devisor = 1;

while(temp>0) {
	devisor=devisor*10;	
	temp=temp/10;
}

if( square%devisor==n) {
	System.out.println(n);
	System.out.println("Automic Number:"+square);
	}
else {

System.out.println("Not a Automic Number:"+square);

	}

}
}