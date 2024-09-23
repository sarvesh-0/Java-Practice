package day1HW;
/*
Write a program to accept a number , Reverse the number and print it [CQ]
*/
import java.util.Scanner;
public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Num : ");
		int num = sc.nextInt();
		sc.close();
		int temp = num ;
		int rev = 0;
		while(temp!=0) {
			int n = temp % 10;
			temp = temp / 10;
			rev = (rev*10)+n;
		}
		System.out.println("Reverse of num "+num+" is "+rev);
	}
}