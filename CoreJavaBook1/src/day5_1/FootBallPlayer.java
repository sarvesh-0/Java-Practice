package day5_1;

import java.util.Scanner;

public class FootBallPlayer extends Players {
	protected String fposition ;
	protected int fgoalscored;

public FootBallPlayer() {
	Scanner sc = new Scanner(System.in);
	System.out.print("\nEnter Player Position: ");
	this.fposition = sc.next();
	System.out.print("\nEnter Goal Scored: ");
	this.fgoalscored = sc.nextInt();
}

@Override
public void display() {
	super.display();
	System.out.println("************************ Foot Ball States ************************");
	System.out.println("Position : "+fposition);
	System.out.println("Goal Scored : "+fgoalscored);
	System.out.println("******************************************************************");
}
}
