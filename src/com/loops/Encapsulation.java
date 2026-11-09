package com.loops;

public class Encapsulation {
private int id;
private String name;
private double salary;
private int password;

void setId(int id) {
	this.id=id;
}
int  getId() {
	return id;
}


void setName(String name) {
	this.name=name;
}
String  getName() {
	return name;
}


void setSalary(double salary) {
	this.salary=salary;
}
double  getSalary() {
	return salary;
}


void setPassword(int password) {
	this.password=password;
}
int  getPassword() {
	return password;
}


}
