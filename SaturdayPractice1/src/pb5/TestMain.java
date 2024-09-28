package pb5;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Ticket t ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Tickets You want to book :");
		int b = sc.nextInt();
		t = new Ticket();
		int a =t.calculateTotalCost(b);
		
		System.out.println("Total Amount = "+a);
	}
}
