package com.OopAbstraction;

public class Product {
int productid;
String productname;
double price;

Product(int productid,String productname,double price) {
	
this.productid=productid;
this.productname=productname;
this.price=price;

}
void displayproductdetails() {
		
		System.out.println("Product Name: "+productname);
		System.out.println("Product ID: "+productid);
		System.out.println("Product Price: "+price);

		}
}


class Electronics extends Product{
	String brand;
	Electronics(int productid,String productname,double price,String brand){
		super(productid,productname,price);
		this.brand=brand;
	}
void displayproductdetails() {
		
	System.out.println("Brand: "+brand);
		System.out.println("Product Name: "+productname);
		System.out.println("Product ID: "+productid);
		System.out.println("Product Price: "+price);

		}
}



class Clothing extends Product{
	String size;
	Clothing(int productid,String productname,double price,String size){
		super(productid,productname,price);
		this.size=size;
	}
void displayproductdetails() {
		System.out.println("Size: "+size);
		System.out.println("Product Name: "+productname);
		System.out.println("Product ID: "+productid);
		System.out.println("Product Price: "+price);

		}
}



class Furniture extends Product{
	String material;
	Furniture(int productid,String productname,double price,String material){
		super(productid,productname,price);
		this.material=material;
	}
void displayproductdetails() {
		System.out.println("Material Name: "+material);
		System.out.println("Product Name: "+productname);
		System.out.println("Product ID: "+productid);
		System.out.println("Product Price: "+price);

		}
}

