package day5_1;

import java.util.Scanner;

public class Batsman extends Cricketer{
	int runs;
	int centuries;
	int halfcenturies;
	int ducks;
	
	public Batsman() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Player Runs: ");
		runs = sc.nextInt();
		System.out.print("\nEnter Centuries: ");
		centuries = sc.nextInt();
		System.out.print("\nEnter halfcenturies ");
		halfcenturies = sc.nextInt();
		System.out.print("\nEnter Ducks ");
		ducks = sc.nextInt();
		sc.close();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Runs : "+runs);
		System.out.println("Centuries : "+centuries);
		System.out.println("Half Centuries : "+halfcenturies);
		System.out.println("Ducks : "+ducks);
	}
}
