package day1_extra;
import java.util.Scanner;

/*
Write a Java Program to check weather the  given number is spy number or not.
Example : 
1124 =1x1x2x4=8
1124 =1+1+2+4=8
 */
public class Spy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Num : ");
		int num = sc.nextInt();
		sc.close();
		int temp = num;
		int sum = 0;
		int mul = 1;
		while(temp!=0) {
			int n = temp % 10;
			temp = temp / 10;
			sum = sum + n;
			mul = mul * n;
		}
		System.out.println("Sum = "+sum);
		System.out.println("Mul = "+mul);
		if(sum == mul ) {
			System.out.println(num+" is Spy !");
		}
		else {
			System.out.println(num+" is not Spy !");
		}
	}

}
