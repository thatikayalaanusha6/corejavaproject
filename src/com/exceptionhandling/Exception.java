package com.exceptionhandling;


class Book {
	
	void displayBook() {
		System.out.println("This is Book method");
	}
 }

	class Magazine{
		void displayMagazine() {
			System.out.println("This is Magazine method");
		}
	}
public class Exception {

	public Exception(String message) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Object obj = new Magazine();
		try {
		Book b = (Book) obj;
		b.displayBook();
		}catch(ClassCastException e) {
			System.out.println(e.getMessage());
		}

	}

}
