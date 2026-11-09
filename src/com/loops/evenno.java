package com.loops;

public class evenno {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++)
		{
		if(i % 2 == 0) {
			System.out.println(i);
	}
		
	int	sum = 0;
		for (int j = 1; j <= 100;j++) {
	
		sum=sum+j;
		}
		System.out.println("sum  : "+sum);
	
		}

	}
}

