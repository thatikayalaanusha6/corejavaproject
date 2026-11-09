package com.Inheritance;


public class OrderDetails {
int orderid;
String Customername;
double Price;

OrderDetails(int orderid,String Customername,double Price){
	this.orderid=orderid;
	this.Customername=Customername;
	this.Price=Price;
}


void displayDetails() {
	System.out.println("Order id : "+orderid);
	System.out.println("Customer Name : "+Customername);
	System.out.println("Price of the order item : "+Price);

}

}


class Pizzaorder extends OrderDetails{
	
	Pizzaorder(int orderid, String Customername, double Price) {
		super(orderid, Customername, Price);
		
	}

//	void displayDetails() {
//		System.out.println("Order id : "+orderid);
//		System.out.println("Customer Name : "+Customername);
//		System.out.println("Price of the order item : "+Price);
//        System.out.println("you ordered pizza");
//        
//	}
}

class Burgerorder extends OrderDetails{
	Burgerorder(int orderid, String Customername, double Price) {
		super(orderid, Customername, Price);
		
	}

//	void displayDetails() {
//		System.out.println("Order id : "+orderid);
//		System.out.println("Customer Name : "+Customername);
//		System.out.println("Price of the order item : "+Price);
//		System.out.println("you ordered burger");
//	}	
}

	class main{
		public static void main(String[] args) {

			OrderDetails od1 = new Pizzaorder (111,"Anusha",100);
			OrderDetails od2 = new Pizzaorder (222,"Anu",300);
			od1.displayDetails();
			System.out.println("*********************************************");
			
			od2.displayDetails();
			System.out.println("---------------------------------------------------");
			OrderDetails od3 = new Burgerorder (100,"A",200);
			OrderDetails od4 = new Burgerorder (101,"B",500);
			od3.displayDetails();
			System.out.println("*********************************************");
			od4.displayDetails();
			
		}
	}


