package com.fundamentals1_methods;

public class TestMethodsDemo2 {

	// in instance can we call instance methods...?
	// in instance can we call static methods...?
	 void main() {
		
	System.out.println("main method started");
	addition();
	subtraction();
	 multiplication();
	 Division();
	System.out.println("main method ended");

	}
  void addition()
  {
   int	a = 100;
   int b = 200;
   int sum = a + b;  
   System.out.println( sum);
}

  static void subtraction()
  {
	  int	a = 100;
	   int b = 200;
	   int diff = a - b; 
	   System.out.println(diff);
  }
  
  void multiplication()
  {
   int	a = 100;
   int b = 200;
   int mul = a * b;  
   System.out.println(mul);
}
  

  static void Division()
  {
	  int	a = 100;
	   int b = 200;
	   int div = a % b; 
	   System.out.println(div);
  }
  
}
