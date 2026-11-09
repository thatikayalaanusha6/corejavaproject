package com.arrays;
//Store 4 decimal numbers and find their average.
public class DoubleArray {

	public static void main(String[] args) {

		        double[] a = {10.5, 20.5, 30.5, 40.5};

		        double sum = 0;

		        for (int i = 0; i < a.length; i++) {
		            sum = sum + a[i];
		        }

		        double average = sum / a.length;

		        System.out.println("Average = " + average);
		    
	}

}
