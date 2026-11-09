package com.loops;

public class sumofevennumbers {

	public static void main(String[] args) {
		System.out.println("***checking perfect numbers***");
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0) {
				sum = sum + i;
			}
			}
		System.out.println("sum of even numbers between 1 to 100 : "+sum);
		}

	}


