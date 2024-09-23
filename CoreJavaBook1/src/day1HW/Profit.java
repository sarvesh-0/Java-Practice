package day1HW;
/*
With selling price of a bag and cost price available , find whether profit incurred or loss
*/
import java.util.Scanner;

public class Profit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Selling Price of bag :");
		int sp = sc.nextInt();
		System.out.println("Enter the Cost Price of bag :");
		int cp = sc.nextInt();
		sc.close();
		if(sp>cp) {
			System.out.println("You are in Profit !");
		}
		else {
			System.out.println("You are in Loss !");
		}
	}

}