package com.arrays;

public class Largestelement {

	public static void main(String[] args) {
		int[] num;
		num = new int[10];
		num[0]=176;
		num[1]=156;
		num[2]=453;
		num[3]=676;
		num[4]=189;
		num[5]=198;
		num[6]=3452;
		num[7]=679;
		num[8]=5643;
		num[9]=465;
		
		int larger=num[0];
		for(int i = 0; i < num.length ;i++)
		{
			if(num[i] > larger) {
                larger = num[i];
            }
		}
System.out.println("larger number is : "+larger);
	}

}
