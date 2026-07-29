package com.fundamentals;

public class NoRnNoArg {
	
   void main(String[] args) 
	   
   {
	   System.out.println("main method started");
	   ShowPlanDetails();
	   recharge(299.0);
   }
	   
	   void ShowPlanDetails()
	   {
		   String plan_name = "Unlimited 299";
			String validity = "28 Days";
			String data = "1.5 GB/Day";
			String calls = "Unlimited";
	   
	   
	   System.out.println("Plane Name : "+plan_name);
	   System.out.println("Validity : "+validity);
	   System.out.println("Data : "+data);
	   System.out.println("Calls : "+calls);
	   System.out.println("*********************************************");
	}
	
	   
	   void recharge(double amount)
	   {
		  System.out.println("Recharge Successful"); 
		  System.out.println(amount);
	   }

}
