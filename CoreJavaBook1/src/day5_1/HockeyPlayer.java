package day5_1;
//1.Write a class Player and inherit HockyPlayer, Cricketer, FootBallPlayer classes. Derive Batsman and Bowler classes from Cricketer.

import java.util.Scanner;

public class HockeyPlayer extends Players {
	String position ;
	int goalscored;
	
	public HockeyPlayer() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Player Position: ");
		position = sc.nextLine();
		System.out.print("\nEnter Goal Scored: ");
		goalscored = sc.nextInt();
		sc.close();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Position : "+position);
		System.out.println("Goal Scored : "+goalscored);
	}
}
