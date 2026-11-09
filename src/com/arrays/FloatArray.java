package com.arrays;
//Store 5 float values and find the largest value.
public class FloatArray {

	public static void main(String[] args) {
		

		        float[] a = {10.5f, 25.7f, 15.2f, 40.8f, 30.1f};

		        float max = a[0];

		        for (int i = 1; i < a.length; i++) {
		            if (a[i] > max) {
		                max = a[i];
		            }
		        }

		        System.out.println("Largest = " + max);
		    }
		}

	


