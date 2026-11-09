package com.arrays;

public class Smallestnumber {

	public static void main(String[] args) {
		int[] sm;
		sm = new int[4];
		sm[0]=4656;
		sm[1]=4643;
		sm[2]=123;
		sm[3]=49086;
		
int smallnum = sm[0];
for(int i=0; i<sm.length;i++) {
	if(sm[i] < smallnum) {
		smallnum = sm[i];
    }
}
System.out.println("smallest number is : "+smallnum);
	}

}
