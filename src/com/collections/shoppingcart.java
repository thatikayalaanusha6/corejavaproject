package com.collections;
import java.util.concurrent.*;
import java.util.Iterator;
public class shoppingcart {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> 
		products = new CopyOnWriteArrayList<>();
		
		products.add("Laptop");
		products.add("keyboard");
		products.add("Monitor");
		products.add("Mouse");
		
		Iterator <String> oldIterator = products.iterator();
		
		products.add("headphones");
		products.remove("Mouse");
		
		System.out.println("Old Iterator: ");
		while(oldIterator.hasNext()) {
			System.out.println(oldIterator.next());
			
			
		}
		
		Iterator <String> newIterator = products.iterator();
		System.out.println("Updated List: ");
		while(newIterator.hasNext()) {
			System.out.println(newIterator.next());
		}
	}

}
