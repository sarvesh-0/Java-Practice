package day1HW;
/*
Write a program to accept the number from user and check if it is divisible by 5
*/
import java.util.Scanner;
public class DivisibleBy5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		if(num%5==0) {
			System.out.println("Num "+num+" is divisible by 5");
		}
		else {
			System.out.println("Num "+num+" is not divisible by 5");
		}
	}
}
