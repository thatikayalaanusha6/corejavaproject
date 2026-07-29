package com.corejava;
import java.util.Scanner;

public class Cricket_Player {

	String PlayerName;
	int MatchesPlayed;
	int TotalRuns;
	double AverageRuns ;
	
	 Cricket_Player(String PlayerName, int MatchesPlayed, int TotalRuns)
	{
		System.out.println("Parametraised constructor is called");
		
		this.PlayerName=PlayerName;
		this.MatchesPlayed=MatchesPlayed;
		this.TotalRuns=TotalRuns;
	}
	
	void Disp()
	{
		double AverageRuns = TotalRuns/MatchesPlayed;
		
		System.out.println("Player Name :"+PlayerName);
		System.out.println("Matches Played :"+MatchesPlayed);
		System.out.println("Total Runs : "+TotalRuns);
		System.out.println("Average Runs : "+AverageRuns);
	}
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);

System.out.println("Enter Player Name: ");
String PlayerName = sc.nextLine();


System.out.println("Enter No of Matches Played: ");
int MatchesPlayed = sc.nextInt();

System.out.println("Total Runs: ");
int TotalRuns = sc.nextInt();



Cricket_Player cp = new Cricket_Player("Virat Kohli", 20, 100);
cp.Disp();

	}

}
