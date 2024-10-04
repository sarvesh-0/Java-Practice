package day9_4;
import java.util.Scanner;
public class StringDemo3 {
	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		ch = sc.next().charAt(0);
		sc.close();
		
		int temp = ch;
		if(temp >= 65 && temp <= 90) {
			System.out.println(ch+" is a Upper case Character ..");
		}
		else if(temp >= 97 && temp <= 122) {
			System.out.println(ch+" is a Lower case Character ..");
		}
		else if(temp >= 48 && temp <=57) {
			System.out.println(ch+" is a number ..");
		}
		else {
			System.out.println(ch+" is a Special Character ..");
		}
	}
}
