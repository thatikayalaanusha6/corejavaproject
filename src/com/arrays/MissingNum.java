package com.arrays;



public class MissingNum {

	public static void main(String[] args) {
		int a[] = {1,2,4,5,6};
		int n=6;
		for(int i=1;i<=n;i++) {
			boolean found=false;
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					found = true;
					break;
				}
			}if(!found) {
				System.out.println("missing number:"+i);	
			}
		}
	}

}
