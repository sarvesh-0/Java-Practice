package day5_1;

import java.util.Scanner;

public class Players {
	protected String playername;
//	int playerh;
//	int playerw;
	protected int playerage;
//	String playerCity;
//	String playerState;
	protected String playerNation;
	protected String playerTeam;
	
	public Players() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Player Name: ");
		this.playername = sc.next();
		System.out.print("\nEnter Player Nationality: ");
		this.playerNation = sc.next();
		System.out.print("\nEnter Player Age: ");
		this.playerage = sc.nextInt();
		System.out.print("\nEnter Player Team: ");
		this.playerTeam = sc.next();
		sc.nextLine();
	}
	
	public void display() {
		System.out.println("*********************Player Personal Info ************************");
		System.out.println("Player Name: "+playername);
		System.out.println("Player Age: "+playerage);
		System.out.println("Player Nationality: "+playerNation);
		System.out.println("Player Team: "+playerTeam);
	}
}
