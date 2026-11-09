package com.constructors;

public class CopyConstructor {
	String place;

	CopyConstructor(String place){
		this.place=place;
	}
	
	CopyConstructor(CopyConstructor p ){
		this.place=p.place;
	}
	public static void main(String[] args) {
		
		CopyConstructor c = new CopyConstructor("Hyderabad");
		CopyConstructor c2 = new CopyConstructor(c);
		
		System.out.println(c.place);
		System.out.println(c2.place);
	}

}
