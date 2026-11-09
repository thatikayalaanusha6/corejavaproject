package com.arrays;

import java.util.Scanner;

public class Arrayprograme1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] ages;
		
		ages = new int[5];
		
		ages[0]=20;
		ages[1]=24;
		ages[2]=26;
		ages[3]=28;
		ages[4]=21;
		
		for(int i = 0; i < ages.length;i++) {
			 {
				System.out.println(ages[i]);
				
			}
			
		}
//			System.out.println("*****************");
//			
//		System.out.println(ages[4]);
		
	}

}
