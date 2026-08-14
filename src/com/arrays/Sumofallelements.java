package com.arrays;

public class Sumofallelements {

	public static void main(String[] args) {
	 int[] number;
	  number = new int[6];
	  number[0]=122;
	  number[1]=122;
	  number[2]=122;
	  number[3]=122;
	  number[4]=122;
	  number[5]=122;
	  
	  
	  int sum=0;
	  for(int i=0; i < number.length;i++ ) {
		sum=sum + number[i]; 
	  }
	  System.out.println("sum of the elements are : "+sum);
	}

}
