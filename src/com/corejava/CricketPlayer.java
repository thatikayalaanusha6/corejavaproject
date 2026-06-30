package com.corejava;

public class CricketPlayer {
	
	static String Teamname = "INDIA";
	String playername;
	int runs;
//void disp() {
//	System.out.println("team name : "+Teamname);
//	System.out.println("player name :"+playername);
//	System.out.println("runs : "+runs);
//  }
	public static void main(String[] args) {
		
		CricketPlayer virat = new CricketPlayer();
		virat.playername = "virat";
		virat.runs = 50 ;
		System.out.println("PlayerName : " + Teamname);
		System.out.println("PlayerName : " + virat.playername);
		System.out.println("Number of Runs : " + virat.runs);	
		//virat.disp();
		
		System.out.println("*******************************************");
		
		CricketPlayer Dhoni = new CricketPlayer();
		Teamname = "USA";
		Dhoni.playername = "Dhoni";
		Dhoni.runs = 70 ;
		System.out.println("TeamName : " + Teamname);
		System.out.println("PlayerName : " + Dhoni.playername);
		System.out.println("Number of Runs : " + Dhoni.runs);
		//Dhoni.disp();
		
		System.out.println("*******************************************");
		
		CricketPlayer Rohit = new CricketPlayer();
		Rohit.playername = "Rohit Sharma";
		Rohit.runs = 60 ;
		System.out.println("TeamName : " + Teamname);
		System.out.println("PlayerName : " + Rohit.playername);
		System.out.println("Number of Runs : " + Rohit.runs);
		//Rohit.disp();
		
		 
		

	}

}
