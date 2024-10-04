package day9_4;
import java.util.Scanner;
public class StringDemo1 {
	public static void main(String[] args) {
		char a;
		char b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char1: ");
		a=sc.next().charAt(0);
		System.out.println("Enter char2: ");
		b=sc.next().charAt(0);
		sc.close();
		System.out.println("Sum = "+(a+b));
		System.out.println("Diff = "+(a-b));
	}
}
