package com.loops;

import java.util.Scanner;

public class Rnumber {


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter secret number (1-10): ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= 3; i++) {

	            System.out.print("Enter your guess: ");
	            int guess = sc.nextInt();

	            if (guess == n) {
	                System.out.println("You Won!");
	                return;
	            }
	        }

	        System.out.println("You Lost!");
	        System.out.println("Number was: " + n);
	    }
	}
		
	


