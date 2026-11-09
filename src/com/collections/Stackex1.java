package com.collections;

import java.util.Stack;

public class Stackex1 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(20);
		s.push(40);
		
		System.out.println(s.contains(20));
		
		System.out.println(s.remove(Integer.valueOf(20)));
		
		System.out.println(s.pop());
		
		System.out.println(s);
		
		//last element in the stack
		System.out.println(s.peek());
		
	}

}
