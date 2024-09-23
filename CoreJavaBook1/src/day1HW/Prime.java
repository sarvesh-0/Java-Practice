package day1HW;
/*
Write a program to accept the number and check if it is prime or not [CQ]
*/
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Num : ");
		int num = sc.nextInt();
		sc.close();
		boolean isPrime = true;
		if(num<=1) {
			isPrime = false;
		}
		else if(num%2 == 0) {
			isPrime = true;
		}
		else {
			for(int i=3; i<num/2; i=i+2) {
				if(num%i==0) {
					isPrime = false;
				}
			}
		}
		if(isPrime==true) {
			System.out.println(num+" is Prime !");
		}
		else {
			System.out.println(num+" is not Prime !");
		}
	}

}
