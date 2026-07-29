package com.fundamentals;

public class MTdetails {
	
	 int Ticket_ID = 111;
	 int Screen_NO = 1;
	 int Ticket_Price = 150;
	String Online_Booking_Status = "Available";
	int Age = 20;
	int No_of_Tickets = 2;
	long Contact_Number = 7989704841L;
	float GST_Amount = 50.50f;
	
	public static void main(String[] args) {
		
		MTdetails mt = new MTdetails();
		
		System.out.println("HERE IS THE DEATILS OF THE MOVIE TICKETS");
		System.out.println("**********************************************************");
		System.out.println("Movie ticket ID : " +mt.Ticket_ID);
		System.out.println("Movie Screen Number : " +mt.Screen_NO);
		System.out.println("Movie Ticket Price : " +mt.Ticket_Price);
		System.out.println("Online Booking Service  : " +mt.Online_Booking_Status);
		System.out.println("Age of the Person : " +mt.Age);
		System.out.println("Number of Tickets Booked : "+mt.No_of_Tickets);
		System.out.println("Contact Number : " +mt.Contact_Number);
		System.out.println("GST Amount : " +mt.GST_Amount);
	

	}

}
