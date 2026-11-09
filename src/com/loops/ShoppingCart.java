package com.loops;

public class ShoppingCart {
 private int cartitem;
 private double totalamount;
 
 void setCartItem(int cartitem) {
		this.cartitem=cartitem;
	}
	int  getCartItem() {
		return cartitem;
	}
	
	void setTotalAmount(double totalamount) {
		this.totalamount=totalamount;
	}
	double  getTotalAmount() {
		return totalamount;
	}
 
 
 
 
 void additem(double price) {
	 
	 if(price>0) {
	 cartitem++;
	 totalamount+=price;
	 System.out.println("your item is selected");
	 }else {
		 System.out.println("your choosen item is discarded");
	 }
	 
 }
 
void removeitem(double price) {
	if(price > 0&&cartitem>0) {
	 cartitem--;
	 totalamount -= price;
	 System.out.println("item is removed");
	 
	}
	else {
		System.out.println("item not removed");
	}
 }
public int getCartitem() {
	return cartitem;
}

public double getTotalamount() {
	return totalamount;
}



}
