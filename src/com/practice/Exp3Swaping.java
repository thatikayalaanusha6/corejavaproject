package com.practice;

public class Exp3Swaping {

	public static void main(String[] args) {
		int a= 15;
		int b = 20;
//		int temp;
//System.out.println("swapping nubers using third variable :");
//System.out.println("******************************************");
//        temp=b;
//        b=a;
//        a=temp;
		System.out.println("swapping numbers without using third variable :");
		a=a+b;
		b=a-b;
		a=a-b;
        System.out.println(a);
        System.out.println(b);
	}


}
