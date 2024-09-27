package day5_1;

import java.util.Scanner;

public class Cricketer extends Players{
	protected String role;
	protected int matchPlayed;
	protected int catches;
	
	public Cricketer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Player Role: ");
		this.role = sc.next();
		System.out.print("\nEnter Match Played: ");
		this.matchPlayed = sc.nextInt();
		System.out.print("\nEnter Total Catches: ");
		this.catches = sc.nextInt();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("************************ Cricket States ************************");
		System.out.println("Role : "+role);
		System.out.println("Match Played : "+matchPlayed);
		System.out.println("Total Catches : "+catches);
	}
}
