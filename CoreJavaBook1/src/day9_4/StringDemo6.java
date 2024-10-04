package day9_4;

import java.util.Scanner;
public class StringDemo6 {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		str = sc.nextLine().trim();
		sc.close();
		str = " "+str;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
				System.out.print(str.charAt(i+1)+" ");
			}
		}
	}
}
