package day5_1;

import java.util.Scanner;

public class Bowler extends Cricketer {
	int wickets;
	int hatricks;
	int dots;
	int extras;
	
	public Bowler() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Player Wickets: ");
		wickets = sc.nextInt();
		System.out.print("\nEnter Hatricks: ");
		hatricks = sc.nextInt();
		System.out.print("\nEnter dots: ");
		dots = sc.nextInt();
		System.out.print("\nEnter extras: ");
		extras = sc.nextInt();
		sc.close();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Wickets : "+wickets);
		System.out.println("Hatricks : "+hatricks);
		System.out.println("Dots : "+dots);
		System.out.println("Extras : "+extras);
	}
}
