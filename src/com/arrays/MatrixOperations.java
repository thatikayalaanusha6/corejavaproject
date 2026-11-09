package com.arrays;

public class MatrixOperations {

	public static void main(String[] args) {
		
int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
 
for(int i=0;i<3;i+=2) {
	int temp=a[i][0];
	a[i][0]=a[i][2];
	a[i][2]=temp;
}
for(int j=0;j<3;j++) {
	if(j!=1) {
		a[1][j]=a[1][j]*2;
	}
}
for(int i=0;i<3;i++) {
	a[i][i]=a[i][i]*a[i][i];
}
System.out.println("modified matrix: ");
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		System.out.print(a[i][j] + " ");
	}
	System.out.println();
}
	}

}
