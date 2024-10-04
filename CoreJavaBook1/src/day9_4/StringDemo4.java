package day9_4;

import java.util.Scanner;

public class StringDemo4 {
	public static void main(String[] args) {
		String str,str1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		str = sc.nextLine().toUpperCase();
		sc.close();
		str1 = str.replaceAll("[AEIOU]","");
		System.out.println("str = "+str1);
	}
}
