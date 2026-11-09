package com.arrays;

public class BooleanArray {

	public static void main(String[] args) {
		

		        boolean[] a = {true, false, true, true, false};

		        int count = 0;

		        for (int i = 0; i < a.length; i++) {
		            if (a[i] == true) {
		                count++;
		            }
		        }

		        System.out.println("True values = " + count);
		    }
		}

	


