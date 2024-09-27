package day5_1;

import java.util.Scanner;

public class Bowler extends Cricketer {
	int wickets;
	int hatricks;
	int dots;
	int extras;
	
	public Bowler() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Player Wickets: ");
		this.wickets = s.nextInt();
		System.out.print("\nEnter Hatricks: ");
		this.hatricks = s.nextInt();
		System.out.print("\nEnter dots: ");
		this.dots = s.nextInt();
		System.out.print("\nEnter extras: ");
		this.extras = s.nextInt();
		s.close();
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
