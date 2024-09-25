package day3Hw;

import java.util.Scanner;

/*
 Write a method to print Fibonacci series.
 */
public class Fibonacii {
	public static void fibonacii(int no) {
		int first = 0;
		int second = 1;
		int sum = 0;
		System.out.print(first+" ");
		System.out.print(second+" ");
		for(int i=0; i<no; i++) {
			sum = first + second ;
			first = second;
			second = sum ;
			System.out.print(sum+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		sc.close();
		fibonacii(n);
	}
}
