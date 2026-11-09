package com.loops;

public class ShoppingCartMain {

	public static void main(String[] args) {
		ShoppingCart s=new ShoppingCart();
		s.additem(400);
		s.additem(4000);
		
		double res=s.getTotalamount();
		System.out.println(res);
		
		int res1=s.getCartitem();
		System.out.println(res1);
		
		s.removeitem(400);
		
		double res2=s.getTotalamount();
		System.out.println(res2);
		
		int res3=s.getCartitem();
		System.out.println(res3);
	}

}
