package com.arrays;

public class LeadersOfTheArray {

	public static void main(String[] args) {
		int[] a= {16,17,4,3,5,2}; 
		System.out.println("leader elements: ");
		for(int i=0;i<a.length;i++) {
			boolean leader=true;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<=a[j]) {
					leader=false;
					break;
				}
			}
			if(leader) {
				System.out.println(a[i] + " ");
			}
		}

	}

}
