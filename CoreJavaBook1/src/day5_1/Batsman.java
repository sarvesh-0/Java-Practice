package day5_1;

import java.util.Scanner;

public class Batsman extends Cricketer{
	protected int runs;
	protected int centuries;
	protected int halfcenturies;
	protected int ducks;
	
	public Batsman() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Player Runs: ");
		this.runs = sc.nextInt();
		System.out.print("\nEnter Centuries: ");
		this.centuries = sc.nextInt();
		System.out.print("\nEnter halfcenturies ");
		this.halfcenturies = sc.nextInt();
		System.out.print("\nEnter Ducks ");
		this.ducks = sc.nextInt();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Runs : "+runs);
		System.out.println("Centuries : "+centuries);
		System.out.println("Half Centuries : "+halfcenturies);
		System.out.println("Ducks : "+ducks);
		System.out.println("******************************************************************");
	}
}
