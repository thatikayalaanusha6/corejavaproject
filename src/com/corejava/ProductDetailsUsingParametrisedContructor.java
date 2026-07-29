package com.corejava;

public class ProductDetailsUsingParametrisedContructor {

    int id;
    String productName;
    double price;

    ProductDetailsUsingParametrisedContructor(int productid, String productName, double price) {

        System.out.println("Parameterized constructor called");

        this.id = productid;
        this.productName = productName;
        this.price = price;
    }
    
    void Anu()
    {
    	 System.out.println("Product ID : " + id);
         System.out.println("Product Name : " + productName);
         System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
    	 
        ProductDetailsUsingParametrisedContructor p1 = new ProductDetailsUsingParametrisedContructor(101, "Laptop", 55000);
       
       
        ProductDetailsUsingParametrisedContructor p2 = new ProductDetailsUsingParametrisedContructor(102,"Mobile",30000);
       
        
        ProductDetailsUsingParametrisedContructor p3 = new ProductDetailsUsingParametrisedContructor(103,"Television",70000);

        p1.Anu();
        System.out.println("************************************************************************************************");
        p2.Anu();
        System.out.println("************************************************************************************************");
        p3.Anu();
    }
}