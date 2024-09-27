package day5_1;

import java.util.Scanner;

public class FootBallPlayer extends Players {
String fposition ;
int fgoalscored;

public FootBallPlayer() {
	super();
	Scanner sc = new Scanner(System.in);
	System.out.print("\nEnter Player Position: ");
	this.fposition = sc.nextLine();
	System.out.print("\nEnter Goal Scored: ");
	this.fgoalscored = sc.nextInt();
	sc.close();
}

@Override
public void display() {
	super.display();
	System.out.println("Position : "+fposition);
	System.out.println("Goal Scored : "+fgoalscored);
}
}
