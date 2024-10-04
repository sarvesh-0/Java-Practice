package day9_4;

import java.util.Scanner;

public class StringDemo2 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char1: ");
		a = sc.next().charAt(0);
		sc.close();

		if(a == 'z') {
			b = a-25;
			c = a-1;
		}
		else {
			b = a+1;
			c = a+25;
			
		}
		System.out.println((char)a+" follows "+(char)b+" & "+(char)c+" follows "+(char)a);
	}
}
