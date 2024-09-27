package day5_1;

import java.util.Scanner;

public class Players {
	String playername;
//	int playerh;
//	int playerw;
	int playerage;
//	String playerCity;
//	String playerState;
	String playerNation;
	String playerTeam;
	
	public Players() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Player Name: ");
		playername = sc.nextLine();
		System.out.print("\nEnter Player Nationality: ");
		playerNation = sc.next();
		System.out.print("\nEnter Player Age: ");
		playerage = sc.nextInt();
		System.out.print("\nEnter Player Team: ");
		playerTeam = sc.nextLine();
		sc.nextLine();
	}
	
	public void display() {
		System.out.println("Player Name: "+playername);
		System.out.println("Player Age: "+playerage);
		System.out.println("Player Nationality: "+playerNation);
		System.out.println("Player Team: "+playerTeam);
	}
}
