package day1_extra;
/*
 Write a Java Program to check weather the  given number is duck number or not.
Definition: A Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number.
 For example 3210, 8050896, 70709 are all duck numbers whereas 02364, 03401 are not.
 */
import java.util.Scanner;
public class Duck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Num : ");
		int num = sc.nextInt();
		sc.close();
		int temp = num;
		boolean flag = false;
		while(temp>0) {
			int n = temp % 10;
//			if(temp/10 == 0) {
//				flag = false;
//				break;
//			}
//			else {
			temp = temp / 10;
			if(n == 0) {
				flag = true;
			}
			}
//		}
		if(flag==true) {
			System.out.println(num+" is a Duck Number");
		}
		else {
			System.out.println(num+" is not a Duck Number");
		}
	}

}
