package day5_1;

import java.util.Scanner;

public class Bowler extends Cricketer {
	protected int wic;
	protected int hat;
	protected int dots;
	protected int extras;
	
	public Bowler() {
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter Player Wickets: ");
		this.wic = s.nextInt();
		System.out.print("\nEnter Hatricks: ");
		this.hat = s.nextInt();
		System.out.print("\nEnter dots: ");
		this.dots = s.nextInt();
		System.out.print("\nEnter extras: ");
		this.extras = s.nextInt();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("\nWickets : "+wic);
		System.out.println("Hatricks : "+hat);
		System.out.println("Dots : "+dots);
		System.out.println("Extras : "+extras);
		System.out.println("******************************************************************");
	}
}
