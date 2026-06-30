package com.corejava;

public class Cricket {
	
	int jerseyno;
	String Cricketname;
	
	static int countryID;
	static String countryname;
	
	

	public static void main(String[] args) {
		
		 countryID = 91;
		 countryname = "INDIA";
		
		System.out.println(countryID);
		System.out.println(countryname);
		
		
		Cricket c = new Cricket();
		//int jerseyno = 18;
		c.jerseyno = 18;
		
		//String Cricketname = "Virat";
		c.Cricketname = "Virat";
		
		System.out.println(c.jerseyno);
		System.out.println(c.Cricketname);
		
	}

}
