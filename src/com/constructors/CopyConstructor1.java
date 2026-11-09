package com.constructors;

public class CopyConstructor1 {
String name;
int age;

CopyConstructor1(String name,int age ){
	this.name=name;
	this.age=age;
}

CopyConstructor1(CopyConstructor1 n){
	this.name=n.name;
	this.age=n.age;
}

void disp() {
	System.out.println("name : "+name);
	System.out.println("age : "+age);

}
	public static void main(String[] args) {
		CopyConstructor1 cc = new CopyConstructor1("Anusha",22);
		CopyConstructor1 cc1 = new CopyConstructor1(cc);
		
		cc.disp();
		System.out.println("*************************");
		cc1.disp();

	}

}
