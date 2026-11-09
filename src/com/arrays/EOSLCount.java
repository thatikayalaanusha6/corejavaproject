package com.arrays;

public class EOSLCount {

	public static void main(String[] args) {
		int[] e= {12,45,7,89,23};
		int largestnum=e[0];
		for(int i=0;i<e.length;i++) {
			if(e[i]>largestnum) {
				largestnum=e[i];
			}
		}
		
		System.out.println("Largest Number: "+largestnum);

		int smallestnum=e[0];
		for(int i=0;i<e.length;i++) {
			if(e[i]<smallestnum) {
				smallestnum=e[i];
			}
		}	System.out.println("Smallest number: "+smallestnum);	
		
		
		int[] a= {2,5,8,9,12};
		int evencount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evencount++;
			}
		}System.out.println("Even count: "+evencount);
		
		
		int[] a1= {2,5,8,9,12};
		int oddcount=0;
		for(int i=0;i<a1.length;i++) {
			if(a1[i]%2==0) {
				oddcount++;
			}
		}System.out.println("Odd count: "+oddcount);
	}

}
