package com.corejava;
import java.util.Scanner;
public class ProductBilling {

	String ProductName;
	double Price;
	int Quantity;
	double Total;
	
	
	
	public ProductBilling(String productName) {
		
		ProductName = productName;
	}


	public ProductBilling(String productName, double price) {

		ProductName = productName;
		Price = price;
	}


	public ProductBilling(String productName, double price, int quantity) {
		
		ProductName = productName;
		Price = price;
		Quantity = quantity;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

	}

}
