package day1_extra;

import java.util.Scanner;

/*
  Write a Java Program to check weather the  given number is neon number or not.
  Definition : A positive integer whose sum of digits of its square is equal to the number itself is called a 
  neon number.
  Example: Number = 9
  9-->9x9=81=8+1=9
 */
public class Neon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Num : ");
		int num = sc.nextInt();
		sc.close();
		int sum =0;
		int sq = num * num;
		int temp = sq;
		while(temp!=0) {
			int n = temp % 10;
			temp = temp / 10;
			sum = sum + n;
		}
		if(sum==num) {
			System.out.println(num+" is neon !");
		}
		else {
			System.out.println(num+" is not neon !");
		}
	}

}