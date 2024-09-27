package day5_1;
//1.Write a class Player and inherit HockyPlayer, Cricketer, FootBallPlayer classes. Derive Batsman and Bowler classes from Cricketer.

import java.util.Scanner;

public class HockeyPlayer extends Players {
	protected String position ;
	protected int goalscored;
	
	public HockeyPlayer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Player Position: ");
		this.position = sc.next();
		System.out.print("\nEnter Goal Scored: ");
		this.goalscored = sc.nextInt();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("************************* Hockey States **************************");
		System.out.println("Position : "+position);
		System.out.println("Goal Scored : "+goalscored);
		System.out.println("******************************************************************");
	}
}
