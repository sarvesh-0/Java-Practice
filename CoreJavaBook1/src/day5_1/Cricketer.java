package day5_1;

import java.util.Scanner;

public class Cricketer extends Players{
	String role;
	int matchPlayed;
	int catches;
	
	public Cricketer() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Player Role: ");
		role = sc.nextLine();
		System.out.print("\nEnter Match Played: ");
		matchPlayed = sc.nextInt();
		System.out.print("\nEnter Total Catches: ");
		catches = sc.nextInt();
		sc.close();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Role : "+role);
		System.out.println("Match Played : "+matchPlayed);
		System.out.println("Total Catches : "+catches);
	}
}
