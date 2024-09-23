package day1HW;
/*
Write a program to accept the year and check if it is Leap year or not [CQ]
*/
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Year : ");
		int yr = sc.nextInt();
		sc.close();
		if(yr % 4 == 0 & yr % 100 != 0 | yr % 400 == 0) {
			System.out.println(yr+" is a leap Year !");
		}
		else {
			System.out.println(yr+" is not a leap Year !");
		}
	}

}
