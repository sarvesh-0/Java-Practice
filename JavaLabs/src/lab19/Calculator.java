/*
 Write a simple ‘Calculator’ class which performs basic operations such as “Add”,”Substract”,”Multiply”,”Divide”.
 User should enter two numbers and select operation. Give result according to that.
 */
package lab19;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		String opt;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter 1st Number : ");
		int n1 = sc.nextInt();
		System.out.print("\nEnter 2nd Number : ");
		int n2 = sc.nextInt();
		System.out.println("Select The Operation :");
		System.out.println("Enter add for Addition :");
		System.out.println("Enter sub for Subtraction :");
		System.out.println("Enter mul for Multiplication :");
		System.out.println("Enter div for Division :");
		opt = sc.next();
	}
}
