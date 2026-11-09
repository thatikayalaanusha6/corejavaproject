package com.arrays;

import java.util.Scanner;

public class DisplayMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int sum=0;
		System.out.println("Enter 9 elements: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}
System.out.println("Matrix:");
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		System.out.println(a[i][j] +" ");
	}System.out.println();
}

for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
	}

}
