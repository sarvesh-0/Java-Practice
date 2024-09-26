package day3Hw;
/*
 Write a method to check whether number is even or odd and print appropriate message.
 */
import java.util.Scanner;
public class EvenOdd {
	
	public boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		else {
			return false ;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int no = sc.nextInt();
		sc.close();
		EvenOdd e = new EvenOdd();
		boolean res = e.isEven(no);
		if(res) {
			System.out.println(no+" is Even !");
		}
		else {
			System.out.println(no+" is Odd !");
		}
	}
}
