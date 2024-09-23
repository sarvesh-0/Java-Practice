package day1;
/*
Write a Java Program to accept integer, float, double, char, string variable and display
*/
import java.util.Scanner;
public class ProgramDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Integer Value : ");
		int n = sc.nextInt();
		System.out.println("Enetr Float Value : ");
		float m = sc.nextFloat();
		System.out.println("Enetr Double Value : ");
		double p = sc.nextDouble();
		System.out.println("Enetr String Value (Single Word) : ");
		String str1 = sc.next();
		sc.nextLine();
		System.out.println("Enetr String Value (Multi World) : ");
		String str2 = sc.nextLine();
		System.out.println("Enetr Charecter Value : ");
		char ch = sc.nextLine().charAt(0);
		sc.close();
		
		System.out.println("Int n = "+n);
		System.out.println("Float m = "+m);
		System.out.println("Double p = "+p);
		System.out.println("String str1 = "+str1);
		System.out.println("String str2 = "+str2);
		System.out.println("char ch = "+ch);
	}
}
