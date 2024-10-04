package day9_4;

import java.util.Scanner;

public class StringDemo5 {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		str = sc.nextLine().toUpperCase();
		sc.close();
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
				
			}else {
				count++;
			}
		}
		System.out.println("Total Words : "+count);
	}
}
